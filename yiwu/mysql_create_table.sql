/**
  @Author 徐佳伟
  @Info 8-607 物联网1803
  @comment 有问题随时反馈，数据表非常重要。
           有外键的都靠后放。简单表都在前面
           没有用到default属性，建议可添
 */
drop table if exists `order`,express,roles,
    shippingaddress,
    followandfans,thumbsup,steponpraise,
    objecttrace,evaluate,shoppingcar,goods,category,user,chatrecord,jurisdiction;

#权限表
create table jurisdiction
(
    jurisdiction_id int auto_increment comment '权限id',
    functionname    varchar(256) not null comment '方法名',
    yuliu           varchar(512),
    constraint PK_JURISDICTION primary key (jurisdiction_id)
) comment ='权限表';

#角色表，暂未用到
create table roles
(
    role_id      int auto_increment comment '角色Id',
    role_name    varchar(32) not null comment '角色名称',
    jurisdiction int comment '对应权限',
    yuliu        varchar(512),
    constraint PK_ROLE primary key (role_id),
    constraint FK_ROLE_JURISDICTION foreign key (jurisdiction) references jurisdiction (jurisdiction_id)
) comment = '角色表';


#用户表，做登录，注册，查询等
create table user
(
    user_id           int auto_increment comment '用户id',
    user_name         varchar(32)  not null comment '用户名',
    user_pwd          varchar(512) not null comment 'md5()加密',
    user_nickname     varchar(32)  not null comment '用户昵称',
    user_profile      varchar(512) comment '用户简介',
    user_createtime   timestamp comment '用户创建时间',
    user_login        timestamp comment '用户最后一次登录时间',
    follow_count      int          not null comment '关注人数数量',
    fan_count         int          not null comment '粉丝数量',
    publish_itemcount int          not null comment '发布物品数量',
    order_dealcount   int          not null comment '订单已成交数量',
    order_count       int          not null comment '订单数量',
    user_reputation   float        not null comment '用户信誉',
    yuliu             varchar(512),
    constraint PK_USER primary key (user_id)
) comment ='用户表';

create table category
(
    category_id    int auto_increment comment '分类id',
    category_name  varchar(32) not null comment '分类名字',
    category_state int         not null comment '0:禁用；1:启用',
    yuliu          varchar(512),
    constraint PK_CATEGORY primary key (category_id)
) comment ='分类表';

#商品拥有外键————用户id
create table goods
(
    goods_id         int auto_increment comment '商品id',
    goods_name       varchar(256)  not null comment '商品名称',
    goods_info       varchar(4096) not null comment '商品简介',
    goods_img        varchar(4096) not null comment '商品图片',
    user_id          int           not null comment '商品发布者', #varchar已改为int
    goods_createtime timestamp comment '商品发布时间',
    goods_likecount  int           not null comment '商品赞数量',
    goods_step       int           not null comment '商品踩数量',
    goods_status     int           not null comment '0:未交易；1:已易出；2:未发布',
    category_id      int           not null comment '商品分类id',
    goods_show       int           not null comment '0:禁用（隐藏）；1:启用（显示）',
    yuliu            varchar(512),
    constraint PK_GOODS primary key (goods_id),
    constraint FK_GOODS_USER foreign key (user_id) references user (user_id),
    constraint FK_GOODS_CATEGORY foreign key (category_id) references category (category_id)
) comment ='商品表';



create table shippingaddress
(
    address_id     int auto_increment comment '地址id',
    user_id        int          not null comment '用户id',
    address_state  int          not null comment '地址状态',
    addr_province  varchar(128) not null comment '收货人所在省',
    addr_city      varchar(128) not null comment '收货人所在城市',
    addr_area      varchar(128) not null comment '收货人所在区县',
    addr_detail    varchar(128) not null comment '详细地址',
    user_name      varchar(256) not null comment '收货人姓名',
    user_cellphone varchar(256) not null comment '收货人电话号码',
    addresscreate  timestamp comment '地址创建时间',
    yuliu          varchar(512),
    constraint PK_SHIPPINGADDRESS primary key (address_id)
) comment ='收货地址表';

#购物车，多对多
create table shoppingcar
(
    buy_goods_id     int auto_increment comment '购物id',
    user_id          int not null comment '用户id',
    goods_id         int not null comment '商品id',
    goods_addtime    timestamp comment '商品加入时间',
    goods_deletetime timestamp comment '商品删除时间',
    yuliu            varchar(512),
    constraint PK_SHOPPINGCAR primary key (buy_goods_id)
) comment ='购物车表';

#聊天记录，多对多
create table chatrecord
(
    chat_id  int auto_increment comment '聊天id',
    send_id  int not null comment '发送者id',
    copy_id  int not null comment '接收者id',
    sendinfo varchar(512) comment '发送内容',
    sendtime timestamp default now() comment '发送时间',
    yuliu    varchar(512),
    constraint PK_CHATRECORD primary key (chat_id)
) comment ='聊天记录表';

#多对多
#查自己粉丝：id放到follow_id上
#查自己关注：id放到fans_id上
create table followandfans
(
    faf_id     int auto_increment comment '关&粉id',
    follow_id  int not null comment '关注者id',
    fans_id    int not null comment '粉丝id',
    followtime timestamp comment '关注时间',
    yuliu      varchar(512),
    constraint PK_FOLLOWANDFANS primary key (faf_id)
) comment ='关注与粉丝表';

#赞表（个人理解）,多对多
create table thumbsup
(
    give_id        int auto_increment comment '点赞id',
    user_id        int not null comment '点赞用户id',
    buser_id       int not null comment '被赞用户id',
    top_createtime timestamp default now() comment '点赞时间',
    yuliu          varchar(512),
    constraint PK_THUMBSUP primary key (give_id)
) comment = '点赞表';

#踩表（个人理解）,多对多
create table steponpraise
(
    bottom_id         int auto_increment comment '踩赞id',
    user_id           int not null comment '用户id',
    buser_id          int not null comment '被踩用户id',
    bottom_createtime timestamp default now() comment '踩赞时间',
    yuliu             varchar(512),
    constraint PK_STEPONPRAISE primary key (bottom_id)
) comment ='踩赞表';

#订单表
#拥有发起人user，address外键，交换人user，address外键,商品分组外键
create table `order`
(
    order_id         int auto_increment comment '订单id',
    title            varchar(512)  not null comment '商品名字',
    order_group      int(3)        not null comment '商品分组id',
    add_time         timestamp     not null comment '创建时间',
    info             varchar(4096) not null comment '物品信息-简介（副文本）',
    img              varchar(4096) not null comment '商品图片',
    create_people    int           not null comment '发起人',
    buy_people       int comment '交换人',
    state            tinyint       not null comment '0:未交易；1:已发起请求；2:已同意请求；3:拒绝请求；4:已发货；5:确认收货',
    buy_time         timestamp comment '发起请求时间',
    sure_time        timestamp comment '请求确认时间',
    end_time         timestamp comment '结束时间',
    create_addressid int comment '发起人收货地址id',
    buy_addressid    int comment '交换人收货id',
    yuliu            varchar(512) comment '预留',
    constraint PK_ORDER primary key (order_id),
    constraint FK_ORDER_USER_2 foreign key (buy_people) references user (user_id),
    constraint FK_ORDER_USER_1 foreign key (create_people) references user (user_id),
    constraint FK_ORDER_ADDRESS_2 foreign key (buy_addressid) references shippingaddress (address_id),
    constraint FK_ORDER_ADDRESS_1 foreign key (create_addressid) references shippingaddress (address_id),
    constraint FK_ORDER_CATEGORY foreign key (order_group) references category (category_id)
) comment ='订单表';

#物流
create table objecttrace
(
    trace_id    int auto_increment comment '物迹id',
    user_id     int not null comment '用户id',
    goods_id    int not null comment '商品id',
    browse_time timestamp comment '浏览时间',
    yuliu       varchar(512),
    constraint PK_OBJECTTRACE primary key (trace_id),
    constraint FK_TRACE_USER foreign key (user_id) references user (user_id),
    constraint FK_TRACE_GOODS foreign key (goods_id) references goods (goods_id)
) comment ='物迹表';

create table evaluate
(
    evaluate_id      int auto_increment comment '评价id',
    user_id          int           not null comment '用户id',
    goods_id         int           not null comment '商品id',
    evaluate_content varchar(4096) not null comment '评价内容',
    evaluate_time    timestamp comment '评价时间',
    yuliu            varchar(512),
    constraint PK_EVALUATE primary key (evaluate_id),
    constraint FK_EVALUATE_USER foreign key (user_id) references user (user_id),
    constraint FK_EVALUATE_GOODS foreign key (goods_id) references goods (goods_id)
) comment ='评价表';

create table express
(
    express_id                          int auto_increment comment '快递id',
    address_id                          int          not null comment '收货地址id',
    express_company                     int          not null comment '0:京东物流;1顺丰;2:跨越速运;3:百世汇通;4:宅急送;5:中通快递;6:申通快递;7:圆通快递;8:韵达快递;9:国通快递',
    courier_number                      varchar(255) not null comment '快递单号',
    sponsor_delivery_time               timestamp comment '发起人发货时间',
    confirmer_requesttime               timestamp comment '确认请求人发货时间',
    receivingtime_of_initiator          timestamp comment '发起人确认收货时间',
    confirmation_request_receiving_time timestamp comment '确认请求人收货时间',
    yuliu                               varchar(512),
    constraint PK_EXPRESS primary key (express_id),
    constraint FK_EXPRESS_ADDRESS foreign key (address_id) references shippingaddress (address_id)
) comment ='快递表';
