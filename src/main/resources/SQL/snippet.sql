create TABLE public.user (
	id serial PRIMARY KEY,
	name VARCHAR (255),
	joining_date date
)

create TABLE snippet (
	id serial PRIMARY KEY,
	user_id int not null,
	name VARCHAR (255),
	creatingDate date NOT NULL,
	modifyingDate date,
	description TEXT,
	detail TEXT,
	language VARCHAR (255),
	type VARCHAR (255),
	FOREIGN key(user_id) REFERENCES public.user(id) on delete CASCADE
)