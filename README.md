# Pokemons REST Api
#### Simplie Rest Api created with Java, MySql, Spring Boot, Maven, IntelliJ

## Table of Contents
* [General Info](#general-information)
* [Technologies Used](#technologies-used)
* [Features](#features)
* [Setup](#setup)
* [Usage](#usage)
* [Project Status](#project-status)
* [Room for Improvement](#room-for-improvement)
* [Acknowledgements](#acknowledgements)
* [Contact](#contact)

## General Information
- this project is simplie REST Api which gives the opportunity putting, deleting, updating, retreiving Pokemons from the database.

## Technologies Used
* Java version: 11
* Spring Boot: 2.5.1
* Springfox: 3.0.0
* MySql
## Features
- retreiving all Pokemons from the database
- retreiving Pokemon by Id from the database
- retreiving Pokemon by name from the database
- deleting specific Pokemon from the database
- adding Pokemon to the database
- updating Pokemon to the database

## Setup
You have to download whole Pokemons-Rest-Api to your development environment.
The configurable parameters of an application are stored in application.properties file in Resources folder.
To make application work correctly with your database, you have to set your url path, give username and password. To create table, set spring.jpa.hibernate.ddl-auto=create and start your server. Then change 'create' to 'valide' to avoid loosing yor added rows.
All dependencies needed to this project, are located in pom.xml file providing by Maven.

## Usage
If you want to check specific method how it works, open your browser and type: localhost:...(here put your localhost number - default is 8080).../swagger-ui/
You see the web with all available methods. Choose one of them, and ........have a fun.

## Project Status
Project is: _in progress -
I will be working on it.


## Room for Improvement
- errors handling (partially done)
- pagination
- authentication
- create tests

## Acknowledgements
- This project was inspired by JIT Team
- Many thanks to the JIT team who gave me the opportunity to take a part in recruitment process

## Contact
Created by @MarekKordowski
