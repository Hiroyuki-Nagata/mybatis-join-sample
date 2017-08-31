DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
  `id` INT(10) 
  , `first_name` VARCHAR(18) 
  , `last_name` VARCHAR(18)
  , `kind` VARCHAR(1)
  , `age` INT);

DROP TABLE IF EXISTS `skill`;

CREATE TABLE `skill` (
  `id` INT(10)
  , `person_id` INT(10)
  , `desc` VARCHAR(200)
);

INSERT INTO `person`(`id`, `first_name`, `last_name`, `kind`, `age`)
VALUES (1, 'John', 'Smith', 'E', 33)
, (2, 'Jane', 'Smith', 'A', 24)
, (3, 'Jonny', 'Smith', 'B', 55)
, (4, 'J', 'J', 'T', 45)
, (5, 'Alan', 'Turing', 'C', 4);

INSERT INTO `skill`(`id`, `person_id`, `desc`)
VALUES (1, 1, 'John Smith is Engineer')
, (2, 2, 'Jane Smith is Artist')
, (3, 3, 'Jonny Smith is Butcher')
, (4, 4, 'J.J is Teacher')
, (5, 5, 'Alan Turing is Computer');