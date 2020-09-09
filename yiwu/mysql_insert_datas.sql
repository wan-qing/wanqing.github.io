insert into user(user_id, user_name, user_pwd, user_nickname, follow_count, fan_count, publish_itemcount,
                 order_dealcount, order_count, user_reputation)
values (default, '1', md5('123'), '1', 0, 0, 0, 0, 0, 0.0),
       (default, '4', md5('123'), '4', 0, 0, 0, 0, 0, 0.0),
       (default, '3', md5('123'), '3', 0, 0, 0, 0, 0, 0.0),
       (default, '2', md5('123'), '2', 0, 0, 0, 0, 0, 0.0);

insert into category(category_id, category_name, category_state)
values(default,'1','1'),
      (default,'2','1'),
      (default,'3','1'),
      (default,'4','1'),
      (default,'5','1');

insert into jurisdiction(jurisdiction_id, functionname)
values (default,'1'),
       (default,'2'),
       (default,'3'),
       (default,'4'),
       (default,'5');

insert into roles(role_id, role_name, jurisdiction)
values (default,'1',1),
       (default,'2',2),
       (default,'3',3),
       (default,'4',4),
       (default,'5',5),
       (default,'6',1);

insert into goods(goods_id, goods_name, goods_info, goods_img, user_id, goods_likecount, goods_step, goods_status, category_id, goods_show)

values (default,'商品1','测试','图片1',1,0,0,2,1,1),
       (default,'商品2','测试','图片2',1,0,0,2,1,1),
       (default,'商品3','测试','图片3',1,0,0,2,1,1),
       (default,'商品4','测试','图片4',1,0,0,2,1,1),
       (default,'商品5','测试','图片5',1,0,0,2,1,1),
       (default,'商品6','测试','图片6',1,0,0,2,1,1),
       (default,'商品7','测试','图片7',1,0,0,2,1,1),
       (default,'商品8','测试','图片8',1,0,0,2,1,1),
       (default,'商品9','测试','图片9',1,0,0,2,1,1),
       (default,'商品10','测试','图片10',1,0,0,2,1,1),
       (default,'商品11','测试','图片11',1,0,0,2,1,1);

insert into shippingaddress(address_id, user_id, address_state, addr_province, addr_city, addr_area, addr_detail, user_name, user_cellphone, addresscreate)
values (default,1,1,'1','1','1','1','1','1',now()),
       (default,2,1,'1','1','1','1','1','1',now()),
       (default,3,1,'1','1','1','1','1','1',now()),
       (default,4,1,'1','1','1','1','1','1',now()),
       (default,3,1,'1','1','1','1','1','1',now()),
       (default,2,1,'1','1','1','1','1','1',now());

insert into shoppingcar(buy_goods_id, user_id, goods_id, goods_addtime)
values (default,1,2,now()),
       (default,2,3,now()),
       (default,3,4,now()),
       (default,4,3,now()),
       (default,3,1,now()),
       (default,2,2,now());

insert into chatrecord(chat_id, send_id, copy_id, sendinfo, sendtime)
values (default,1,2,'123',now()),
       (default,2,1,'123',now()),
       (default,3,2,'123',now()),
       (default,4,2,'123',now()),
       (default,3,1,'123',now()),
       (default,3,2,'123',now());

