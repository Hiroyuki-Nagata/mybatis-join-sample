--
-- SQLs from https://www.ntu.edu.sg/home/ehchua/programming/sql/SampleDatabases.html
--
CREATE TABLE employees (
    emp_no      INT             NOT NULL,  -- UNSIGNED AUTO_INCREMENT??
    birth_date  DATE            NOT NULL,
    first_name  VARCHAR(14)     NOT NULL,
    last_name   VARCHAR(16)     NOT NULL,
    gender      VARCHAR(1)      NOT NULL,  -- H2DB not supporting ENUM  
    hire_date   DATE            NOT NULL,
    PRIMARY KEY (emp_no)                   -- Index built automatically on primary-key column
                                           -- INDEX (first_name)
                                           -- INDEX (last_name)
);
