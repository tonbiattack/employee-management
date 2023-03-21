insert into employee_status(employee_status_id,employee_status_name) values 
 (1,'現役社員')
,(2,'休職社員')
,(3,'退職社員')
;
insert into gender(gender_id,gender_code,gender_name) values 
 (1,'0','不明')
,(2,'1','男性')
,(3,'2','女性')
,(4,'9','適用不能')
;
insert into employee.employee(gender_id,employee_status_id,employee_code,family_name,last_name,family_name_furigana,last_name_furigana,date_of_birth,grade,"comment") values 
    (1,1,'56001','田嶋','研人','タジマ','ケント',DATE '1971-11-25',1,'React,Vue.jsなどフロントエンドに詳しい。')
  , (2,1,'11000','中田','あやか','ナカタ','アヤカ',DATE '1994-04-16',8,'Railsの知識が素晴らしい。')
  , (3,2,'33000','橘','まゆみ','タチバナ','マユミ',DATE '2001-01-15',2,'Railsの知識が素晴らしい。')
  , (1,1,'56002','川嶋','美由紀','カワシマ','ミユキ',DATE '1996-11-14',1,'Railsの知識が素晴らしい。')
  , (3,3,'57003','河合','陽子','カワイ','ヨウコ',DATE '1994-12-25',1,'React,Vue.jsなどフロントエンドに詳しい。')
  , (3,1,'44001','桑原','えり奈','クワバラ','エリナ',DATE '1978-12-07',6,'React,Vue.jsなどフロントエンドに詳しい。');
insert into employee.database_skill(database_skill_name) values 
    ('MySQL')
  , ('PostgreSQL')
  , ('DynamoDB')
  , ('MongoDB')
  , ('SQL Server');
insert into employee.employee_database_skill(database_skill_id,skill_level,employee_id) values 
    (3,10,1)
  , (4,5,1)
  , (3,5,2)
  , (4,4,2);
insert into framework_skill(framework_skill_id,framework_skill_name) values 
 (1,'React')
,(2,'AngularJS')
,(3,'Angular')
,(4,'Spring Boot')
,(5,'Vue.js')
,(6,'Ruby on Rails')
,(7,'Gin')
,(8,'Laravel')
,(9,'Django')
,(10,'Flask ')
,(11,'FastAPI')
;
insert into employee.employee_framework_skill(framework_skill_id,skill_level,employee_id) values 
    (4,5,1)
  , (3,5,1)
  , (4,8,2)
  , (3,3,2);
insert into infrastructure_skill(infrastructure_skill_id,infrastructure_skill_name) values 
 (1,'Azure')
,(2,'GCP')
,(3,'AWS')
,(4,'Debian')
,(5,'Linux')
,(6,'CentOS')
;
insert into employee.employee_infrastructure_skill(infrastructure_skill_id,skill_level,employee_id) values 
    (4,6,1)
  , (3,6,1)
  , (4,4,2)
  , (3,3,2);
insert into programming_skill(programming_skill_id,programming_skill_name) values 
 (1,'Java')
,(2,'JavaScript')
,(3,'C言語')
,(4,'C#')
,(5,'PHP')
,(6,'Ruby')
,(7,'Perl')
,(8,'Swift')
,(9,'R言語')
,(10,'Python')
,(11,'Scala')
,(12,'TypeScript')
,(13,'Kotlin')
,(14,'GO')
,(15,'VisualBasic.NET')
,(16,'COBOL')
;
insert into employee.employee_programming_skill(programming_skill_id,skill_level,employee_id) values 
    (4,8,1)
  , (3,9,1)
  , (4,4,2)
  , (3,4,2);
insert into employee.employee_contact_information(employee_id,private_phone_number,private_email) values 
    (1,'090-7288-0763','ozawa_1211@example.org')
  , (2,'090-5516-0113','yuki_murata@example.org')
  , (3,'080-1820-9150','katsuhiko_kawamura@example.org')
  , (4,'090-0541-4742','sakamoto_53@example.ne.jp');insert into employee.active_employee_contact_information(employee_contact_information_id,company_phone_number,company_email) values 
    (1,'090-2663-0737','hayamamasahiro@example.co.jp')
  , (2,'090-0936-7033','mikikumagai@example.org')
  , (3,'090-8113-3201','haga_316@example.co.jp')
  , (4,'080-5518-2477','sano222@example.org');insert into employee.password(active_employee_contact_information_id,password) values 
    (1,'$2a$10$emupGu/Iz8QfrgvxKnwbBOahRh8CI0Wl4gBl4EFSMn8UKt8JPjNdS')
  , (2,'$2a$10$mBJUtNRJ8FV.WuRsOjJ0NODxIlFreq8/fimCsEpU1h0brNO8ZksD6')
  , (3,'$2a$10$kVso902zftx0MMIOg9QvgufQyzcxurFCahZvFMZLQJTBaORHJTv3C');
insert into employee."role"(role_name) values 
    ('ROLE_ADMIN')
  , ('ROLE_SUPER_USER')
  , ('ROLE_USER');
insert into employee.ownership(password_id,role_id) values 
    (1,1)
  , (2,2)
  , (3,3)
  , (1,2);
insert into employee.joining_the_company(employee_id,joining_the_company_date) values 
    (1,DATE '1993-06-01')
  , (2,DATE '1992-10-24')
  , (3,DATE '1999-09-02')
  , (4,DATE '1999-09-25')
  , (5,DATE '1995-02-16')
  , (6,DATE '1992-06-01');
insert into employee.company(company_code,company_name,company_business_content) values 
    ('1','有限会社インフィニティ','インフラの運用保守')
  , ('2','有限会社コスモテック','基幹システムの新規開発')
  , ('3','有限会社ナカガワ','インフラの運用保守')
  , ('4','株式会社サンエー','基幹システムの新規開発')
  , ('5','株式会社エスポワール','インフラの運用保守')
  , ('6','山田工業株式会社','インフラの運用保守')
  , ('7','フロンティア株式会社','最先端技術のソフトウェアの開発')
  , ('8','有限会社マック','基幹システムの新規開発')
  , ('9','株式会社AMS','最先端技術のソフトウェアの開発')
  , ('10','株式会社岡田','インフラの運用保守');insert into employee.belonging_company(company_id,employee_id) values 
    (1,1)
  , (2,2)
  , (3,3)
  , (4,4)
  , (5,5)
  , (6,6);
insert into employee.company_assignment(company_id,employee_id,company_assignment_date) values 
    (1,1,DATE '1993-06-01')
  , (2,2,DATE '1992-10-24')
  , (3,3,DATE '1999-09-02')
  , (4,4,DATE '1999-09-25')
  , (5,5,DATE '1995-02-16')
  , (6,6,DATE '1992-06-01');