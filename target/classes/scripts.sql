CREATE TABLE USERS
(user_id number,
  user_name varchar2(100),
  CONSTRAINT user_pkey PRIMARY KEY (user_id)
)

create sequence users_seq increment by 1 start with 1;

CREATE TABLE TASKS
(task_id number,
 task_name varchar2(100),
 user_id number,
CONSTRAINT task_pkey PRIMARY KEY (task_id),
CONSTRAINT fk_user FOREIGN KEY (user_id)
      REFERENCES USERS (user_id));
      
create sequence tasks_seq increment by 1 start with 1;      