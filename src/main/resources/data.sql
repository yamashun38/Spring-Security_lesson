insert into issues (summary, description) values ('バグA', 'バグがあります');
insert into issues (summary, description) values ('機能要望B', 'Bに追加機能がほしいです');
insert into issues (summary, description) values ('画面Cが遅い', '早くしてほしいです');

-- password1234
insert into users (username, password, authority) values ('tom', '08a49128a32d7f33c0f811282190de86e4012e6301d3262b15fc12c782c56bcd8e31c6b3d0ee1e78', 'ADMIN');
insert into users (username, password, authority) values ('bob', '1198be4b62a54243e2a62a23542aa39b525a00693a562fdd941bcfa73fd7c4087233f8fe5dfff305', 'USER');