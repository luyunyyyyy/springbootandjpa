-- -- -- 初始化 admin
-- -- INSERT INTO `libdemo`.`admin` (`admin_email`, `admin_name`, `admin_password`) VALUES ('luyunyang1@gmail.com', 'luyunyang1', '111111');
-- -- INSERT INTO `libdemo`.`admin` (`admin_email`, `admin_name`, `admin_password`) VALUES ('ms@qq.com', 'ms', '222222');
-- -- INSERT INTO `libdemo`.`admin` (`admin_email`, `admin_name`, `admin_password`) VALUES ('lyy@qq.com', 'lyy', '333333');
-- -- --
-- -- -- 初始化 user
-- --
-- -- INSERT INTO `libdemo`.`user` (`user_class`, `user_college`, `user_email`, `user_gender`, `user_major`, `user_name`, `user_password`, `user_phone_number`, `user_state`, `user_sut_id`) VALUES ('1507', '软件学院', 'luyunyang1@sohu.com', '1', '软件工程', 'lyy', 'luyunyyyyy', '33333333', '异常', '20154839');
-- -- INSERT INTO `libdemo`.`user` (`user_class`, `user_college`, `user_email`, `user_gender`, `user_major`, `user_name`, `user_password`, `user_phone_number`, `user_state`, `user_sut_id`) VALUES ('1508', '软件学院', 'ms@sohu.com', '2', '软件工程', 'ms', 'mashuang', '33333333', '正常', '20154838');
-- -- INSERT INTO `libdemo`.`user` (`user_class`, `user_college`, `user_email`, `user_gender`, `user_major`, `user_name`, `user_password`, `user_phone_number`, `user_state`, `user_sut_id`) VALUES ('1505', '软件学院', 'mssss@sohu.com', '1', '软件工程', 'xxx', 'xxxxxxxxxx', '33333333', '正常', '20154333');
-- --
-- -- -- 初始化 notice
-- -- INSERT INTO `libdemo`.`notice` (`notice_text`) VALUES ('this is notice1');
-- -- INSERT INTO `libdemo`.`notice` (`notice_text`) VALUES ('this is notice2');
-- -- INSERT INTO `libdemo`.`notice` (`notice_text`) VALUES ('this is notice3');
-- --
-- --
-- --
-- --
-- -- -- 初始化 location
-- -- INSERT INTO `libdemo`.`location` (`location_desks_left_number`, `location_desks_number`, `location_floor`, `location_part`, `location_state`) VALUES ('2', '2', '1', 'A', '正常');
-- -- INSERT INTO `libdemo`.`location` (`location_desks_left_number`, `location_desks_number`, `location_floor`, `location_part`, `location_state`) VALUES ('1', '1', '1', 'A', '正常');
-- -- INSERT INTO `libdemo`.`location` (`location_desks_left_number`, `location_desks_number`, `location_floor`, `location_part`, `location_state`) VALUES ('3', '3', '1', 'A', '正常');
-- --
-- --
-- -- -- 初始化 desk
-- -- INSERT INTO `libdemo`.`desk` (`desk_location_id`, `desk_state`, `desk_text`) VALUES ('1', '正常', '正常');
-- -- INSERT INTO `libdemo`.`desk` (`desk_location_id`, `desk_state`, `desk_text`) VALUES ('1', '正常', '正常');
-- --
-- -- INSERT INTO `libdemo`.`desk` (`desk_location_id`, `desk_state`, `desk_text`) VALUES ('2', '正常', '正常');
-- --
-- -- INSERT INTO `libdemo`.`desk` (`desk_location_id`, `desk_state`, `desk_text`) VALUES ('3', '正常', '正常');
-- -- INSERT INTO `libdemo`.`desk` (`desk_location_id`, `desk_state`, `desk_text`) VALUES ('3', '正常', '正常');
-- -- INSERT INTO `libdemo`.`desk` (`desk_location_id`, `desk_state`, `desk_text`) VALUES ('3', '正常', '正常');
-- --
-- -- -- 初始化 record
-- --
-- -- INSERT INTO `libdemo`.`reservation_record` (`Record_desk_id`, `Record_user_id`) VALUES ('1', '1');
-- -- INSERT INTO `libdemo`.`reservation_record` (`Record_desk_id`, `Record_user_id`) VALUES ('2', '1');
-- -- INSERT INTO `libdemo`.`reservation_record` (`Record_desk_id`, `Record_user_id`) VALUES ('2', '2');
-- -- INSERT INTO `libdemo`.`reservation_record` (`Record_desk_id`, `Record_user_id`) VALUES ('3', '2');
-- -- INSERT INTO `libdemo`.`reservation_record` (`Record_desk_id`, `Record_user_id`) VALUES ('1', '3');
-- -- INSERT INTO `libdemo`.`reservation_record` (`Record_desk_id`, `Record_user_id`) VALUES ('3', '3');
-- --
-- -- -- 初始化 违规
-- --
--  INSERT INTO `libdemo`.`violationsrecord` (`Violations_user_id`, `Reservation_record_id`) VALUES ('1', '1');
-- --
-- INSERT INTO `libdemo`.`activity` (`activity_classroom_id`, `activity_detail`) VALUES ('2', 'ceshi3');
--
--
-- INSERT INTO `libdemo`.`classroom` (`building_number`, `floor_number`, `room_serial_number`) VALUES ('2', '1', 'A101');
-- INSERT INTO `libdemo`.`classroom` (`building_number`, `floor_number`, `room_serial_number`) VALUES ('2', '2', 'A201');
-- INSERT INTO `libdemo`.`classroom` (`building_number`, `floor_number`, `room_serial_number`) VALUES ('2', '3', 'A301');
--

INSERT INTO `libdemo`.`activity` (`activity_classroom_id`, `activity_detail`) VALUES ('3', '教室id3 占用');
INSERT INTO `libdemo`.`activity` (`activity_classroom_id`, `activity_detail`) VALUES ('4', '教室id4 占用');
INSERT INTO `libdemo`.`activity` (`activity_classroom_id`, `activity_detail`) VALUES ('5', '教室id5 占用');
INSERT INTO `libdemo`.`activity` (`activity_classroom_id`, `activity_detail`) VALUES ('6', '教室id6 占用');
