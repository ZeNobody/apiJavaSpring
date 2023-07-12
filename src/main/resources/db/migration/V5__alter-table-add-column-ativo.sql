alter table medicos add  ativo tinyint;
alter table pacientes add  ativo tinyint;
update medicos set ativo = 1;
update pacientes set ativo = 1;
