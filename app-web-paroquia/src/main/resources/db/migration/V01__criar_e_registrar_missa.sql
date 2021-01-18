CREATE TABLE missa (
	dia VARCHAR(10) PRIMARY KEY,
	horarios VARCHAR(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO missa (dia, horarios) values ('DOMINGO', '8h, 10h, 11h15, 12h30, 17h, 18h30 e 20h');
INSERT INTO missa (dia, horarios) values ('SEGUNDA', '8h, 12h e 17h30');
INSERT INTO missa (dia, horarios) values ('TERCA', '8h, 12h e 17h30');
INSERT INTO missa (dia, horarios) values ('QUARTA', '8h, 12h e 17h30');
INSERT INTO missa (dia, horarios) values ('QUINTA', '8h, 12h e 17h30');
INSERT INTO missa (dia, horarios) values ('SEXTA', '8h, 12h e 17h30');
INSERT INTO missa (dia, horarios) values ('SABADO', '8h, 12h e 16h');
