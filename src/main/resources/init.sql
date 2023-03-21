-- Project Name : employee_management
-- Date/Time    : 2023/01/06 21:56:58
-- Author       : teni2
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2


drop schema employee cascade;
create schema employee;

CREATE SEQUENCE  active_employee_contact_information_id_seq;
CREATE SEQUENCE  belonging_company_id_seq;
CREATE SEQUENCE  assigned_department_id_seq;
CREATE SEQUENCE  assigned_division_id_seq;
CREATE SEQUENCE  assigned_team_id_seq;
CREATE SEQUENCE  assignment_project_id_seq;
CREATE SEQUENCE  assumption_of_position_id_seq;
CREATE SEQUENCE  belonging_department_id_seq;
CREATE SEQUENCE  belonging_division_id_seq;
CREATE SEQUENCE  belonging_project_id_seq;
CREATE SEQUENCE  belonging_team_id_seq;
CREATE SEQUENCE  business_partner_id_seq;
CREATE SEQUENCE  company_id_seq;
CREATE SEQUENCE  company_assignment_id_seq;
CREATE SEQUENCE  contact_information_for_staff_on_leave_id_seq;
CREATE SEQUENCE  current_position_id_seq;
CREATE SEQUENCE  database_skill_id_seq;
CREATE SEQUENCE  department_id_seq;
CREATE SEQUENCE  division_id_seq;
CREATE SEQUENCE  employee_id_seq;
CREATE SEQUENCE  employee_address_id_seq;
CREATE SEQUENCE  employee_contact_information_id_seq;
CREATE SEQUENCE  employee_database_skill_id_seq;
CREATE SEQUENCE  employee_framework_skill_id_seq;
CREATE SEQUENCE  employee_infrastructure_skill_id_seq;
CREATE SEQUENCE  employee_programming_skill_id_seq;
CREATE SEQUENCE  employee_project_record_id_seq;
CREATE SEQUENCE  employee_status_id_seq;
CREATE SEQUENCE  evaluation_id_seq;
CREATE SEQUENCE  framework_skill_id_seq;
CREATE SEQUENCE  gender_id_seq;
CREATE SEQUENCE  infrastructure_skill_id_seq;
CREATE SEQUENCE  joining_the_company_id_seq;
CREATE SEQUENCE  leave_of_absence_id_seq;
CREATE SEQUENCE  ownership_id_seq;
CREATE SEQUENCE  password_id_seq;
CREATE SEQUENCE  position_id_seq;
CREATE SEQUENCE  programming_skill_id_seq;
CREATE SEQUENCE  project_id_seq;
CREATE SEQUENCE  project_completion_report_id_seq;
CREATE SEQUENCE  reinstatement_id_seq;
CREATE SEQUENCE  retired_employee_id_seq;
CREATE SEQUENCE  retired_employee_contact_information_id_seq;
CREATE SEQUENCE  retirement_id_seq;
CREATE SEQUENCE  role_id_seq;
CREATE SEQUENCE  team_id_seq;


-- 現役社員連絡先
drop table if exists active_employee_contact_information cascade;

create table active_employee_contact_information (
  active_employee_contact_information_id integer default nextval('active_employee_contact_information_id_seq') not null
  , employee_contact_information_id integer not null
  , company_phone_number character varying(21) not null
  , company_email character varying(256) not null
  , constraint active_employee_contact_information_PKC primary key (active_employee_contact_information_id)
) ;

-- 配属部署
drop table if exists assigned_department cascade;

create table assigned_department (
  assigned_department_id integer default nextval('assigned_department_id_seq') not null
  , employee_id integer not null
  , department_id integer not null
  , assigned_department_date date not null
  , constraint assigned_department_PKC primary key (assigned_department_id)
) ;

-- 配属課
drop table if exists assigned_division cascade;

create table assigned_division (
  assigned_division_id integer default nextval('assigned_division_id_seq') not null
  , division_id integer not null
  , employee_id integer not null
  , assigned_division_date date not null
  , constraint assigned_division_PKC primary key (assigned_division_id)
) ;

-- 配属チーム
drop table if exists assigned_team cascade;

create table assigned_team (
  assigned_team_id integer default nextval('assigned_team_id_seq') not null
  , employee_id integer not null
  , team_id integer not null
  , assigned_team_date date not null
  , constraint assigned_team_PKC primary key (assigned_team_id)
) ;

-- 配属案件
drop table if exists assignment_project cascade;

create table assignment_project (
  assignment_project_id integer default nextval('assignment_project_id_seq') not null
  , assignment_project_date date not null
  , project_id integer not null
  , employee_id integer not null
  , constraint assignment_project_PKC primary key (assignment_project_id)
) ;

-- 役職就任
drop table if exists assumption_of_position cascade;

create table assumption_of_position (
  assumption_of_position_id integer default nextval('assumption_of_position_id_seq') not null
  , position_id integer not null
  , employee_id integer not null
  , assumption_of_position_date date not null
  , constraint assumption_of_position_PKC primary key (assumption_of_position_id)
) ;

-- 所属会社
drop table if exists belonging_company cascade;

create table belonging_company (
  belonging_company_id integer default nextval('belonging_company_id_seq') not null
  , company_id integer not null
  , employee_id integer not null
  , constraint belonging_company_PKC primary key (belonging_company_id)
) ;

-- 所属部署
drop table if exists belonging_department cascade;

create table belonging_department (
  belonging_department_id integer default nextval('belonging_department_id_seq') not null
  , department_id integer not null
  , employee_id integer not null
  , constraint belonging_department_PKC primary key (belonging_department_id)
) ;

-- 所属課
drop table if exists belonging_division cascade;

create table belonging_division (
  belonging_division_id integer default nextval('belonging_division_id_seq') not null
  , division_id integer not null
  , employee_id integer not null
  , constraint belonging_division_PKC primary key (belonging_division_id)
) ;

-- 所属案件
drop table if exists belonging_project cascade;

create table belonging_project (
  belonging_project_id integer default nextval('belonging_project_id_seq') not null
  , project_id integer not null
  , employee_id integer not null
  , constraint belonging_project_PKC primary key (belonging_project_id)
) ;

-- 所属チーム
drop table if exists belonging_team cascade;

create table belonging_team (
  belonging_team_id integer default nextval('belonging_team_id_seq') not null
  , employee_id integer not null
  , team_id integer not null
  , constraint belonging_team_PKC primary key (belonging_team_id)
) ;

-- 会社配属
drop table if exists company_assignment cascade;

create table company_assignment (
  company_assignment_id integer default nextval('company_assignment_id_seq') not null
  , company_id integer not null
  , employee_id integer not null
  , company_assignment_date date not null
  , constraint company_assignment_PKC primary key (company_assignment_id)
) ;

-- 休職社員連絡先
drop table if exists contact_information_for_staff_on_leave cascade;

create table contact_information_for_staff_on_leave (
  contact_information_for_staff_on_leave_id integer default nextval('contact_information_for_staff_on_leave_id_seq') not null
  , employee_contact_information_id integer not null
  , company_email character varying(256) not null
  , constraint contact_information_for_staff_on_leave_PKC primary key (contact_information_for_staff_on_leave_id)
) ;

-- 現役職
drop table if exists current_position cascade;

create table current_position (
  current_position_id integer default nextval('current_position_id_seq') not null
  , position_id integer not null
  , employee_id integer not null
  , constraint current_position_PKC primary key (current_position_id)
) ;

-- 社員住所
drop table if exists employee_address cascade;

create table employee_address (
  employee_address_id integer default nextval('employee_address_id_seq') not null
  , employee_id integer not null
  , post_code character(8) not null
  , address character varying(161) not null
  , constraint employee_address_PKC primary key (employee_address_id)
) ;

-- 社員データベーススキル
drop table if exists employee_database_skill cascade;

create table employee_database_skill (
  employee_database_skill_id integer default nextval('employee_database_skill_id_seq') not null
  , database_skill_id integer not null
  , skill_level integer not null
  , employee_id integer not null
  , constraint employee_database_skill_PKC primary key (employee_database_skill_id)
) ;

-- 社員フレームワークスキル
drop table if exists employee_framework_skill cascade;

create table employee_framework_skill (
  employee_framework_skill_id integer default nextval('employee_framework_skill_id_seq') not null
  , framework_skill_id integer not null
  , skill_level integer not null
  , employee_id integer not null
  , constraint employee_framework_skill_PKC primary key (employee_framework_skill_id)
) ;

-- 社員インフラスキル
drop table if exists employee_infrastructure_skill cascade;

create table employee_infrastructure_skill (
  employee_infrastructure_skill_id integer default nextval('employee_infrastructure_skill_id_seq') not null
  , infrastructure_skill_id integer not null
  , skill_level integer not null
  , employee_id integer not null
  , constraint employee_infrastructure_skill_PKC primary key (employee_infrastructure_skill_id)
) ;

-- 社員プログラミングスキル
drop table if exists employee_programming_skill cascade;

create table employee_programming_skill (
  employee_programming_skill_id integer default nextval('employee_programming_skill_id_seq') not null
  , programming_skill_id integer not null
  , skill_level integer not null
  , employee_id integer not null
  , constraint employee_programming_skill_PKC primary key (employee_programming_skill_id)
) ;

-- 社員案件実績
drop table if exists employee_project_record cascade;

create table employee_project_record (
  employee_project_record_id integer default nextval('employee_project_record_id_seq') not null
  , project_leaving_date date not null
  , evaluation_point text not null
  , reflection_point text not null
  , project_id integer not null
  , employee_id integer not null
  , constraint employee_project_record_PKC primary key (employee_project_record_id)
) ;

-- 評価
drop table if exists evaluation cascade;

create table evaluation (
  evaluation_id integer default nextval('evaluation_id_seq') not null
  , year integer not null
  , quarter integer not null
  , comment text not null
  , evaluation integer not null
  , employee_id integer not null
  , constraint evaluation_PKC primary key (evaluation_id)
) ;

-- フレームワークスキル
drop table if exists framework_skill cascade;

create table framework_skill (
  framework_skill_id integer default nextval('framework_skill_id_seq') not null
  , framework_skill_name character varying(20) not null
  , constraint framework_skill_PKC primary key (framework_skill_id)
) ;

-- インフラスキル
drop table if exists infrastructure_skill cascade;

create table infrastructure_skill (
  infrastructure_skill_id integer default nextval('infrastructure_skill_id_seq') not null
  , infrastructure_skill_name character varying(20) not null
  , constraint infrastructure_skill_PKC primary key (infrastructure_skill_id)
) ;

-- 入社
drop table if exists joining_the_company cascade;

create table joining_the_company (
  joining_the_company_id integer default nextval('joining_the_company_id_seq') not null
  , employee_id integer not null
  , joining_the_company_date date not null
  , constraint joining_the_company_PKC primary key (joining_the_company_id)
) ;

-- 休職
drop table if exists leave_of_absence cascade;

create table leave_of_absence (
  leave_of_absence_id integer default nextval('leave_of_absence_id_seq') not null
  , employee_id integer not null
  , leave_of_absence_date date not null
  , constraint leave_of_absence_PKC primary key (leave_of_absence_id)
) ;

-- 役職
drop table if exists position cascade;

create table position (
  position_id integer default nextval('position_id_seq') not null
  , position_code character varying(20) not null
  , position_name character varying(50) not null
  , constraint position_PKC primary key (position_id)
) ;

-- プログラミングスキル
drop table if exists programming_skill cascade;

create table programming_skill (
  programming_skill_id integer default nextval('programming_skill_id_seq') not null
  , programming_skill_name character varying(20) not null
  , constraint programming_skill_PKC primary key (programming_skill_id)
) ;

-- 案件完了報告
drop table if exists project_completion_report cascade;

create table project_completion_report (
  project_completion_report_id integer default nextval('project_completion_report_id_seq') not null
  , project_completion_date date not null
  , project_id integer not null
  , constraint project_completion_report_PKC primary key (project_completion_report_id)
) ;

-- 復職
drop table if exists reinstatement cascade;

create table reinstatement (
  reinstatement_id integer default nextval('reinstatement_id_seq') not null
  , employee_id integer not null
  , reinstatement_date date not null
  , constraint reinstatement_PKC primary key (reinstatement_id)
) ;

-- 退職社員
drop table if exists retired_employee cascade;

create table retired_employee (
  retired_employee_id integer default nextval('retired_employee_id_seq') not null
  , employee_id integer not null
  , returning_permission boolean not null
  , constraint retired_employee_PKC primary key (retired_employee_id)
) ;

-- 退職社員連絡先
drop table if exists retired_employee_contact_information cascade;

create table retired_employee_contact_information (
  retired_employee_contact_information_id integer default nextval('retired_employee_contact_information_id_seq') not null
  , employee_contact_information_id integer not null
  , constraint retired_employee_contact_information_PKC primary key (retired_employee_contact_information_id)
) ;

-- 退職
drop table if exists retirement cascade;

create table retirement (
  retirement_id integer default nextval('retirement_id_seq') not null
  , employee_id integer not null
  , retirement_reason text not null
  , retirement_date date not null
  , constraint retirement_PKC primary key (retirement_id)
) ;

-- 権限
drop table if exists role cascade;

create table role (
  role_id integer default nextval('role_id_seq') not null
  , role_name character varying(50) not null
  , constraint role_PKC primary key (role_id)
) ;

-- チーム
drop table if exists team cascade;

create table team (
  team_id integer default nextval('team_id_seq') not null
  , division_id integer not null
  , team_code character varying(30) not null
  , team_name character varying(70) not null
  , constraint team_PKC primary key (team_id)
) ;

-- データベーススキル
drop table if exists database_skill cascade;

create table database_skill (
  database_skill_id integer default nextval('database_skill_id_seq') not null
  , database_skill_name varchar(20) not null
  , constraint database_skill_PKC primary key (database_skill_id)
) ;

-- 課
drop table if exists division cascade;

create table division (
  division_id integer default nextval('division_id_seq') not null
  , department_id integer not null
  , division_code character varying(20) not null
  , division_name character varying(50) not null
  , business_partner_id integer not null
  , constraint division_PKC primary key (division_id)
) ;

-- 社員連絡先
drop table if exists employee_contact_information cascade;

create table employee_contact_information (
  employee_contact_information_id integer default nextval('employee_contact_information_id_seq') not null
  , employee_id integer not null
  , private_phone_number character varying(21) not null
  , private_email character varying(254) not null
  , constraint employee_contact_information_PKC primary key (employee_contact_information_id)
) ;

-- パスワード
drop table if exists password cascade;

create table password (
  password_id integer default nextval('password_id_seq') not null
  , active_employee_contact_information_id integer not null
  , password text not null
  , constraint password_PKC primary key (password_id)
) ;

-- 所有権限
drop table if exists ownership cascade;

create table ownership (
  ownership_id integer default nextval('ownership_id_seq') not null
  , password_id integer not null
  , role_id integer not null
  , constraint ownership_PKC primary key (ownership_id)
) ;

-- 案件
drop table if exists project cascade;

create table project (
  project_id integer default nextval('project_id_seq') not null
  , project_code character varying(30) not null
  , project_start_date date not null
  , project_content text not null
  , business_partner_id integer not null
  , constraint project_PKC primary key (project_id)
) ;

-- 取引先企業
drop table if exists business_partner cascade;

create table business_partner (
  business_partner_id integer default nextval('business_partner_id_seq') not null
  , business_partner_code character varying(20) not null
  , business_partner_name character varying(50) not null
  , constraint business_partner_PKC primary key (business_partner_id)
) ;

-- 部署
drop table if exists department cascade;

create table department (
  department_id integer default nextval('department_id_seq') not null
  , company_id integer not null
  , department_code character varying(20) not null
  , department_name character varying(50) not null
  , constraint department_PKC primary key (department_id)
) ;

-- 社員
drop table if exists employee cascade;

create table employee (
  employee_id integer default nextval('employee_id_seq') not null
  , gender_id integer not null
  , employee_status_id integer not null
  , employee_code character varying(20) not null
  , family_name character varying(90) not null
  , last_name character varying(60) not null
  , family_name_furigana varchar(90) not null
  , last_name_furigana varchar(180) not null
  , date_of_birth date not null
  , grade integer not null
  , comment text not null
  , constraint employee_PKC primary key (employee_id)
) ;

-- 社員在籍区分
drop table if exists employee_status cascade;

create table employee_status (
  employee_status_id integer default nextval('employee_status_id_seq') not null
  , employee_status_name character varying(20) not null
  , constraint employee_status_PKC primary key (employee_status_id)
) ;

-- 性別
drop table if exists gender cascade;

create table gender (
  gender_id integer default nextval('gender_id_seq') not null
  , gender_code character varying(20) not null
  , gender_name character varying(20) not null
  , constraint gender_PKC primary key (gender_id)
) ;

-- 会社
drop table if exists company cascade;

create table company (
  company_id integer default nextval('company_id_seq') not null
  , company_code character varying(20) not null
  , company_name character varying(50) not null
  , company_business_content text not null
  , constraint company_PKC primary key (company_id)
) ;

alter table active_employee_contact_information
  add constraint active_employee_contact_information_FK1 foreign key (employee_contact_information_id) references employee_contact_information(employee_contact_information_id);

alter table assigned_department
  add constraint assigned_department_FK1 foreign key (employee_id) references employee(employee_id);

alter table assigned_department
  add constraint assigned_department_FK2 foreign key (department_id) references department(department_id);

alter table assigned_division
  add constraint assigned_division_FK1 foreign key (employee_id) references employee(employee_id);

alter table assigned_division
  add constraint assigned_division_FK2 foreign key (division_id) references division(division_id);

alter table assigned_team
  add constraint assigned_team_FK1 foreign key (employee_id) references employee(employee_id);

alter table assigned_team
  add constraint assigned_team_FK2 foreign key (team_id) references team(team_id);

alter table assignment_project
  add constraint assignment_project_FK1 foreign key (employee_id) references employee(employee_id);

alter table assignment_project
  add constraint assignment_project_FK2 foreign key (project_id) references project(project_id);

alter table assumption_of_position
  add constraint assumption_of_position_FK1 foreign key (employee_id) references employee(employee_id);

alter table assumption_of_position
  add constraint assumption_of_position_FK2 foreign key (position_id) references position(position_id);

alter table belonging_company
  add constraint belonging_company_FK1 foreign key (employee_id) references employee(employee_id);

alter table belonging_department
  add constraint belonging_department_FK1 foreign key (department_id) references department(department_id);

alter table belonging_department
  add constraint belonging_department_FK2 foreign key (employee_id) references employee(employee_id);

alter table belonging_division
  add constraint belonging_division_FK1 foreign key (division_id) references division(division_id);

alter table belonging_division
  add constraint belonging_division_FK2 foreign key (employee_id) references employee(employee_id);

alter table belonging_project
  add constraint belonging_project_FK1 foreign key (project_id) references project(project_id);

alter table belonging_project
  add constraint belonging_project_FK2 foreign key (employee_id) references employee(employee_id);

alter table belonging_team
  add constraint belonging_team_FK1 foreign key (team_id) references team(team_id);

alter table belonging_team
  add constraint belonging_team_FK2 foreign key (employee_id) references employee(employee_id);

alter table company_assignment
  add constraint company_assignment_FK1 foreign key (company_id) references company(company_id);

alter table company_assignment
  add constraint company_assignment_FK2 foreign key (employee_id) references employee(employee_id);

alter table contact_information_for_staff_on_leave
  add constraint contact_information_for_staff_on_leave_FK1 foreign key (employee_contact_information_id) references employee_contact_information(employee_contact_information_id);

alter table current_position
  add constraint current_position_FK1 foreign key (employee_id) references employee(employee_id);

alter table current_position
  add constraint current_position_FK2 foreign key (position_id) references position(position_id);

alter table department
  add constraint department_FK1 foreign key (company_id) references company(company_id);

alter table division
  add constraint division_FK1 foreign key (business_partner_id) references business_partner(business_partner_id);

alter table division
  add constraint division_FK2 foreign key (department_id) references department(department_id);

alter table employee
  add constraint employee_FK1 foreign key (employee_status_id) references employee_status(employee_status_id);

alter table employee
  add constraint employee_FK2 foreign key (gender_id) references gender(gender_id);

alter table employee_address
  add constraint employee_address_FK1 foreign key (employee_id) references employee(employee_id);

alter table employee_contact_information
  add constraint employee_contact_information_FK1 foreign key (employee_id) references employee(employee_id);

alter table employee_database_skill
  add constraint employee_database_skill_FK1 foreign key (employee_id) references employee(employee_id);

alter table employee_database_skill
  add constraint employee_database_skill_FK2 foreign key (database_skill_id) references database_skill(database_skill_id);

alter table employee_framework_skill
  add constraint employee_framework_skill_FK1 foreign key (framework_skill_id) references framework_skill(framework_skill_id);

alter table employee_framework_skill
  add constraint employee_framework_skill_FK2 foreign key (employee_id) references employee(employee_id);

alter table employee_infrastructure_skill
  add constraint employee_infrastructure_skill_FK1 foreign key (infrastructure_skill_id) references infrastructure_skill(infrastructure_skill_id);

alter table employee_infrastructure_skill
  add constraint employee_infrastructure_skill_FK2 foreign key (employee_id) references employee(employee_id);

alter table employee_programming_skill
  add constraint employee_programming_skill_FK1 foreign key (programming_skill_id) references programming_skill(programming_skill_id);

alter table employee_programming_skill
  add constraint employee_programming_skill_FK2 foreign key (employee_id) references employee(employee_id);

alter table employee_project_record
  add constraint employee_project_record_FK1 foreign key (project_id) references project(project_id);

alter table employee_project_record
  add constraint employee_project_record_FK2 foreign key (employee_id) references employee(employee_id);

alter table evaluation
  add constraint evaluation_FK1 foreign key (employee_id) references employee(employee_id);

alter table joining_the_company
  add constraint joining_the_company_FK1 foreign key (employee_id) references employee(employee_id);

alter table leave_of_absence
  add constraint leave_of_absence_FK1 foreign key (employee_id) references employee(employee_id);

alter table ownership
  add constraint ownership_FK1 foreign key (role_id) references role(role_id);

alter table ownership
  add constraint ownership_FK2 foreign key (password_id) references password(password_id);

alter table password
  add constraint password_FK1 foreign key (active_employee_contact_information_id) references active_employee_contact_information(active_employee_contact_information_id);

alter table project
  add constraint project_FK1 foreign key (business_partner_id) references business_partner(business_partner_id);

alter table project_completion_report
  add constraint project_completion_report_FK1 foreign key (project_id) references project(project_id);

alter table reinstatement
  add constraint reinstatement_FK1 foreign key (employee_id) references employee(employee_id);

alter table retired_employee
  add constraint retired_employee_FK1 foreign key (employee_id) references employee(employee_id);

alter table retired_employee
  add constraint retired_employee_FK2 foreign key (retired_employee_id) references employee(employee_id);

alter table retired_employee_contact_information
  add constraint retired_employee_contact_information_FK1 foreign key (employee_contact_information_id) references employee_contact_information(employee_contact_information_id);

alter table retirement
  add constraint retirement_FK1 foreign key (employee_id) references employee(employee_id);

alter table team
  add constraint team_FK1 foreign key (division_id) references division(division_id);

comment on table assigned_department is '配属部署';
comment on column assigned_department.assigned_department_id is '配属部署ID';
comment on column assigned_department.employee_id is '社員ID';
comment on column assigned_department.department_id is '部署ID';
comment on column assigned_department.assigned_department_date is '部署配属日時';

comment on table assigned_division is '配属課';
comment on column assigned_division.assigned_division_id is '配属課ID';
comment on column assigned_division.division_id is '課ID';
comment on column assigned_division.employee_id is '社員ID';
comment on column assigned_division.assigned_division_date is '課配属日時';

comment on table assigned_team is '配属チーム';
comment on column assigned_team.assigned_team_id is '配属課ID';
comment on column assigned_team.employee_id is '社員ID';
comment on column assigned_team.team_id is 'チームID';
comment on column assigned_team.assigned_team_date is 'チーム配属日時';

comment on table assignment_project is '配属案件';
comment on column assignment_project.assignment_project_id is '配属案件ID';
comment on column assignment_project.assignment_project_date is '案件配属日時';
comment on column assignment_project.project_id is '案件ID';
comment on column assignment_project.employee_id is '社員ID';

comment on table assumption_of_position is '役職就任';
comment on column assumption_of_position.assumption_of_position_id is '役職就任ID';
comment on column assumption_of_position.position_id is '役職ID';
comment on column assumption_of_position.employee_id is '社員ID';
comment on column assumption_of_position.assumption_of_position_date is '役職就任日時';

comment on table belonging_company is '所属会社';
comment on column belonging_company.belonging_company_id is '所属会社ID';
comment on column belonging_company.company_id is '会社ID';
comment on column belonging_company.employee_id is '社員ID';

comment on table belonging_department is '所属部署';
comment on column belonging_department.belonging_department_id is '所属部署ID';
comment on column belonging_department.department_id is '部署ID';
comment on column belonging_department.employee_id is '社員ID';

comment on table belonging_division is '所属課';
comment on column belonging_division.belonging_division_id is '所属課ID';
comment on column belonging_division.division_id is '課ID';
comment on column belonging_division.employee_id is '社員ID';

comment on table belonging_project is '所属案件';
comment on column belonging_project.belonging_project_id is '所属案件ID';
comment on column belonging_project.project_id is '案件ID';
comment on column belonging_project.employee_id is '社員ID';

comment on table belonging_team is '所属チーム';
comment on column belonging_team.belonging_team_id is '所属チームID';
comment on column belonging_team.employee_id is '社員ID';
comment on column belonging_team.team_id is 'チームID';

comment on table company_assignment is '会社配属';
comment on column company_assignment.company_assignment_id is '会社配属ID';
comment on column company_assignment.company_id is '会社ID';
comment on column company_assignment.employee_id is '社員ID';
comment on column company_assignment.company_assignment_date is '会社配属日時';

comment on table contact_information_for_staff_on_leave is '休職社員連絡先';
comment on column contact_information_for_staff_on_leave.contact_information_for_staff_on_leave_id is '休職社員連絡先ID';
comment on column contact_information_for_staff_on_leave.employee_contact_information_id is '社員連絡先ID';
comment on column contact_information_for_staff_on_leave.company_email is '社用メールアドレス';

comment on table current_position is '現役職';
comment on column current_position.current_position_id is '役職付ID';
comment on column current_position.position_id is '役職ID';
comment on column current_position.employee_id is '社員ID';

comment on table employee_address is '社員住所';
comment on column employee_address.employee_address_id is '社員住所ID';
comment on column employee_address.employee_id is '社員ID';
comment on column employee_address.post_code is '郵便番号';
comment on column employee_address.address is '住所';

comment on table employee_database_skill is '社員データベーススキル';
comment on column employee_database_skill.employee_database_skill_id is '社員データベーススキルID';
comment on column employee_database_skill.database_skill_id is 'データベーススキルID';
comment on column employee_database_skill.skill_level is 'スキルレベル';
comment on column employee_database_skill.employee_id is '社員ID';

comment on table employee_framework_skill is '社員フレームワークスキル';
comment on column employee_framework_skill.employee_framework_skill_id is '社員フレームワークスキルID';
comment on column employee_framework_skill.framework_skill_id is 'フレームワークスキルID';
comment on column employee_framework_skill.skill_level is 'スキルレベル';
comment on column employee_framework_skill.employee_id is '社員ID';

comment on table employee_infrastructure_skill is '社員インフラスキル';
comment on column employee_infrastructure_skill.employee_infrastructure_skill_id is '社員保持インフラスキルID';
comment on column employee_infrastructure_skill.infrastructure_skill_id is 'インフラスキルID';
comment on column employee_infrastructure_skill.skill_level is 'スキルレベル';
comment on column employee_infrastructure_skill.employee_id is '社員ID';

comment on table employee_programming_skill is '社員プログラミングスキル';
comment on column employee_programming_skill.employee_programming_skill_id is '社員保持プログラミングスキルID';
comment on column employee_programming_skill.programming_skill_id is 'プログラミングスキルID';
comment on column employee_programming_skill.skill_level is 'スキルレベル';
comment on column employee_programming_skill.employee_id is '社員ID';

comment on table employee_project_record is '社員案件実績';
comment on column employee_project_record.employee_project_record_id is '社員案件実績ID';
comment on column employee_project_record.project_leaving_date is '案件離任日時';
comment on column employee_project_record.evaluation_point is '評価点';
comment on column employee_project_record.reflection_point is '反省点';
comment on column employee_project_record.project_id is '案件ID';
comment on column employee_project_record.employee_id is '社員ID';

comment on table evaluation is '評価';
comment on column evaluation.evaluation_id is '評価ID';
comment on column evaluation.year is '年度';
comment on column evaluation.quarter is '四半期:1,2,3,4';
comment on column evaluation.comment is 'コメント';
comment on column evaluation.evaluation is '評価:1~10';
comment on column evaluation.employee_id is '社員ID';

comment on table framework_skill is 'フレームワークスキル';
comment on column framework_skill.framework_skill_id is 'フレームワークスキルID';
comment on column framework_skill.framework_skill_name is 'フレームワークスキル名';

comment on table infrastructure_skill is 'インフラスキル';
comment on column infrastructure_skill.infrastructure_skill_id is 'インフラスキルID';
comment on column infrastructure_skill.infrastructure_skill_name is 'インフラスキル名';

comment on table joining_the_company is '入社';
comment on column joining_the_company.joining_the_company_id is '入社ID';
comment on column joining_the_company.employee_id is '社員ID';
comment on column joining_the_company.joining_the_company_date is '入社日時';

comment on table leave_of_absence is '休職';
comment on column leave_of_absence.leave_of_absence_id is '休職ID';
comment on column leave_of_absence.employee_id is '社員ID';
comment on column leave_of_absence.leave_of_absence_date is '休職日時';

comment on table ownership is '所有権限';
comment on column ownership.ownership_id is '所有権限ID';
comment on column ownership.password_id is 'パスワードID';
comment on column ownership.role_id is '権限ID';

comment on table password is 'パスワード';
comment on column password.password_id is 'パスワードID';
comment on column password.active_employee_contact_information_id is '現役社員連絡先ID';
comment on column password.password is 'パスワード';

comment on table position is '役職';
comment on column position.position_id is '役職ID';
comment on column position.position_code is '役職コード';
comment on column position.position_name is '役職名';

comment on table programming_skill is 'プログラミングスキル';
comment on column programming_skill.programming_skill_id is 'プログラミングスキルID';
comment on column programming_skill.programming_skill_name is 'プログラミングスキル名';

comment on table project_completion_report is '案件完了報告';
comment on column project_completion_report.project_completion_report_id is '案件完了報告ID';
comment on column project_completion_report.project_completion_date is '案件終了日時';
comment on column project_completion_report.project_id is '案件ID';

comment on table reinstatement is '復職';
comment on column reinstatement.reinstatement_id is '復職ID';
comment on column reinstatement.employee_id is '社員ID';
comment on column reinstatement.reinstatement_date is '復職日時';

comment on table retired_employee is '退職社員';
comment on column retired_employee.retired_employee_id is '退職社員ID';
comment on column retired_employee.employee_id is '社員ID';
comment on column retired_employee.returning_permission is '出戻り許可';

comment on table retired_employee_contact_information is '退職社員連絡先';
comment on column retired_employee_contact_information.retired_employee_contact_information_id is '退職社員連絡先ID';
comment on column retired_employee_contact_information.employee_contact_information_id is '社員連絡先ID';

comment on table retirement is '退職';
comment on column retirement.retirement_id is '退職ID';
comment on column retirement.employee_id is '社員ID';
comment on column retirement.retirement_reason is '退職事由';
comment on column retirement.retirement_date is '退職日時';

comment on table role is '権限';
comment on column role.role_id is '権限ID';
comment on column role.role_name is '権限名';

comment on table team is 'チーム';
comment on column team.team_id is 'チームID';
comment on column team.division_id is '課ID';
comment on column team.team_code is 'チームコード';
comment on column team.team_name is 'チーム名';

comment on table active_employee_contact_information is '現役社員連絡先';
comment on column active_employee_contact_information.active_employee_contact_information_id is '現役社員連絡先ID';
comment on column active_employee_contact_information.employee_contact_information_id is '社員連絡先ID';
comment on column active_employee_contact_information.company_phone_number is '社用電話番号';
comment on column active_employee_contact_information.company_email is '社用メールアドレス';

comment on table database_skill is 'データベーススキル';
comment on column database_skill.database_skill_id is 'データベーススキルID';
comment on column database_skill.database_skill_name is 'データベースキル名';

comment on table division is '課';
comment on column division.division_id is '課ID';
comment on column division.department_id is '部署ID';
comment on column division.division_code is '課コード';
comment on column division.division_name is '課名';
comment on column division.business_partner_id is '取引先企業ID';

comment on table employee_contact_information is '社員連絡先';
comment on column employee_contact_information.employee_contact_information_id is '社員連絡先ID';
comment on column employee_contact_information.employee_id is '社員ID';
comment on column employee_contact_information.private_phone_number is '私用電話番号';
comment on column employee_contact_information.private_email is '私用メールアドレス';

comment on table project is '案件';
comment on column project.project_id is '案件ID';
comment on column project.project_code is '案件コード';
comment on column project.project_start_date is '案件開始日時';
comment on column project.project_content is '案件内容';
comment on column project.business_partner_id is '取引先企業ID';

comment on table business_partner is '取引先企業';
comment on column business_partner.business_partner_id is '取引先企業ID';
comment on column business_partner.business_partner_code is '取引先企業コード';
comment on column business_partner.business_partner_name is '取引先企業名';

comment on table department is '部署';
comment on column department.department_id is '部署ID';
comment on column department.company_id is '会社ID';
comment on column department.department_code is '部署コード';
comment on column department.department_name is '部署名';

comment on table employee is '社員';
comment on column employee.employee_id is '社員ID';
comment on column employee.gender_id is '性別ID';
comment on column employee.employee_status_id is '社員在籍区分ID';
comment on column employee.employee_code is '社員コード';
comment on column employee.family_name is '姓:漢字で';
comment on column employee.last_name is '名:漢字で';
comment on column employee.family_name_furigana is '姓フリガナ:カタカナで';
comment on column employee.last_name_furigana is '名フリガナ:カタカナで';
comment on column employee.date_of_birth is '生年月日';
comment on column employee.grade is '等級';
comment on column employee.comment is 'コメント';

comment on table employee_status is '社員在籍区分';
comment on column employee_status.employee_status_id is '社員在籍区分ID';
comment on column employee_status.employee_status_name is '社員在籍区分名';

comment on table gender is '性別';
comment on column gender.gender_id is '性別ID';
comment on column gender.gender_code is '性別コード';
comment on column gender.gender_name is '性別名';

comment on table company is '会社';
comment on column company.company_id is '会社ID';
comment on column company.company_code is '会社コード';
comment on column company.company_name is '会社名';
comment on column company.company_business_content is '会社事業内容';

