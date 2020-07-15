-- cleaning up database
delete from tbl_country;
delete from tbl_maritalstatus;
delete from tbl_relationship;
delete from tbl_state;

-- reset id generators (h2 only)
ALTER TABLE tbl_country ALTER COLUMN id RESTART WITH 1;
ALTER TABLE tbl_maritalstatus ALTER COLUMN id RESTART WITH 1;
ALTER TABLE tbl_relationship ALTER COLUMN id RESTART WITH 1;
ALTER TABLE tbl_state ALTER COLUMN id RESTART WITH 1;


-- setting up data
insert into tbl_country (code, language, title, abbreviation) values
(1, 'pt_BR', 'Brasil', 'BR'),
(2, 'pt_BR', 'Argentina', 'AR'),
(3, 'pt_BR', 'Estados Unidos', 'US'),

(1, 'es_ES', 'Brasil', 'BR'),
(2, 'es_ES', 'Argentina', 'AR'),
(3, 'es_ES', 'Estados Unidos', 'US'),

(1, 'en_US', 'Brasil', 'BR'),
(2, 'en_US', 'Argentina', 'AR'),
(3, 'en_US', 'Estados Unidos', 'US')
;

insert into tbl_maritalstatus (code, title, language) values
(1, 'Solteiro(a)', 'pt_BR'),
(2, 'Amasiado(a)', 'pt_BR'),
(3, 'Casado(a)', 'pt_BR'),
(4, 'Separado(a)', 'pt_BR'),
(5, 'Divorciado(a)', 'pt_BR'),
(6, 'Viúvo(a)', 'pt_BR'),

(1, 'Soltero(a)', 'es_ES'),
(2, 'Comprometido(a)', 'es_ES'),
(3, 'Casado(a)', 'es_ES'),
(4, 'Separado(a)', 'es_ES'),
(5, 'Divorciado(a)', 'es_ES'),
(6, 'Viudo(a)', 'es_ES'),

(1, 'Single', 'en_US'),
(2, 'Common-law', 'en_US'),
(3, 'Married', 'en_US'),
(4, 'Separated', 'en_US'),
(5, 'Divorced', 'en_US'),
(6, 'Widowed', 'en_US')
;

insert into tbl_relationship (code, title, language) values
(1, 'Cônjuge', 'pt_BR'),
(2, 'Pai', 'pt_BR'),
(3, 'Mãe', 'pt_BR'),
(4, 'Irmão/Irmã', 'pt_BR'),
(5, 'Filho(a)', 'pt_BR'),

(1, 'Cónyuge', 'es_ES'),
(2, 'Padre', 'es_ES'),
(3, 'Madre', 'es_ES'),
(4, 'Hermano(a)', 'es_ES'),
(5, 'Hijo(a)', 'es_ES'),

(1, 'Spouse', 'en_US'),
(2, 'Father', 'en_US'),
(3, 'Mother', 'en_US'),
(4, 'Brother/Sister', 'en_US'),
(5, 'Son/Daughter', 'en_US')
;

insert into tbl_state (countrycode, title, abbreviation) values
(1, 'Acre', 'AC'),
(1, 'Alagoas', 'AL'),
(1, 'Amapá', 'AP'),
(1, 'Amazonas', 'AM'),
(1, 'Bahia', 'BA'),
(1, 'Ceará', 'CE'),
(1, 'Distrito Federal', 'DF'),
(1, 'Espírito Santo', 'ES'),
(1, 'Goiás', 'GO'),
(1, 'Maranhão', 'MA'),
(1, 'Mato Grosso', 'MT'),
(1, 'Mato Grosso do Sul', 'MS'),
(1, 'Minas Gerais', 'MG'),
(1, 'Pará', 'PA'),
(1, 'Paraíba', 'PB'),
(1, 'Paraná', 'PR'),
(1, 'Pernambuco', 'PE'),
(1, 'Piauí', 'PI'),
(1, 'Rio de Janeiro', 'RJ'),
(1, 'Rio Grande do Norte', 'RN'),
(1, 'Rio Grande do Sul', 'RS'),
(1, 'Rondônia', 'RO'),
(1, 'Roraima', 'RR'),
(1, 'Santa Catarina', 'SC'),
(1, 'São Paulo', 'SP'),
(1, 'Sergipe', 'SE'),
(1, 'Tocantins', 'TO'),

(2, 'Buenos Aires', 'BA'),
(2, 'Catamarca', 'CA'),
(2, 'Chaco', 'CH'),
(2, 'Chubut', 'CT'),
(2, 'Córdoba', 'CB'),
(2, 'Corrientes', 'CR'),
(2, 'Entre Ríos', 'ER'),
(2, 'Formosa', 'FO'),
(2, 'Jujuy', 'JY'),
(2, 'La Pampa', 'LP'),
(2, 'La Rioja', 'LR'),
(2, 'Mendoza', 'MZ'),
(2, 'Misiones', 'MI'),
(2, 'Neuquén', 'NQ'),
(2, 'Río Negro', 'RN'),
(2, 'Salta', 'SA'),
(2, 'San Juan', 'SJ'),
(2, 'San Luis', 'SL'),
(2, 'Santa Cruz', 'SC'),
(2, 'Santa Fe', 'SF'),
(2, 'Santiago del Estero', 'SE'),
(2, 'Tierra del Fuego', 'TF'),
(2, 'Tucumán', 'TU'),

(3, 'Alabama', 'AL'),
(3, 'Alaska', 'AK'),
(3, 'Arizona', 'AZ'),
(3, 'Arkansas', 'AR'),
(3, 'California', 'CA'),
(3, 'Colorado', 'CO'),
(3, 'Connecticut', 'CT'),
(3, 'Delaware', 'DE'),
(3, 'Florida', 'FL'),
(3, 'Georgia', 'GA'),
(3, 'Hawaii', 'HI'),
(3, 'Idaho', 'ID'),
(3, 'Illinois', 'IL'),
(3, 'Indiana', 'IN'),
(3, 'Iowa', 'IA'),
(3, 'Kansas', 'KS'),
(3, 'Kentucky', 'KY'),
(3, 'Louisiana', 'LA'),
(3, 'Maine', 'ME'),
(3, 'Maryland', 'MD'),
(3, 'Massachusetts', 'MA'),
(3, 'Michigan', 'MI'),
(3, 'Minnesota', 'MN'),
(3, 'Mississippi', 'MS'),
(3, 'Missouri', 'MO'),
(3, 'Montana', 'MT'),
(3, 'Nebraska', 'NE'),
(3, 'Nevada', 'NV'),
(3, 'New Hampshire', 'NH'),
(3, 'New Jersey', 'NJ'),
(3, 'New Mexico', 'NM'),
(3, 'New York', 'NY'),
(3, 'North Carolina', 'NC'),
(3, 'North Dakota', 'ND'),
(3, 'Ohio', 'OH'),
(3, 'Oklahoma', 'OK'),
(3, 'Oregon', 'OR'),
(3, 'Pennsylvania', 'PA'),
(3, 'Rhode Island', 'RI'),
(3, 'South Carolina', 'SC'),
(3, 'South Dakota', 'SD'),
(3, 'Tennessee', 'TN'),
(3, 'Texas', 'TX'),
(3, 'Utah', 'UT'),
(3, 'Vermont', 'VT'),
(3, 'Virginia', 'VA'),
(3, 'Washington', 'WA'),
(3, 'West Virginia', 'WV'),
(3, 'Wisconsin', 'WI'),
(3, 'Wyoming', 'WY')
;
