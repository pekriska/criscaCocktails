CREATE DATABASE db_cocktails
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'C'
    LC_CTYPE = 'UTF-8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
    
   CREATE SCHEMA co
    AUTHORIZATION postgres;
    

CREATE TABLE co.t_ingredients
(
    ingredient_id bigserial NOT NULL,
    name character varying(50) NOT NULL,
    PRIMARY KEY (ingredient_id)
);

ALTER TABLE co.t_ingredients
    OWNER to postgres;
    
    
CREATE TABLE co.t_cocktails
(
    cocktail_id bigserial NOT NULL,
    name character varying(50) NOT NULL,
    url character varying(1000) NOT NULL,
    PRIMARY KEY (cocktail_id)
);

ALTER TABLE co.t_cocktails
    OWNER to postgres;
    
 CREATE TABLE co.t_cocktails_x_t_ingredients
(
    cocktail_id bigserial NOT NULL,
    ingredient_id bigserial NOT NULL,
    FOREIGN KEY (cocktail_id)
        REFERENCES co.t_cocktails (cocktail_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    FOREIGN KEY (cocktail_id)
        REFERENCES co.t_ingredients (ingredient_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);

ALTER TABLE co.t_cocktails_x_t_ingredients
    OWNER to postgres;