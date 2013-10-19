CREATE TABLE Target
(
	TargetID INT NOT NULL AUTO_INCREMENT,
	HitCount INT,
	TargetStatus VARCHAR(15),
	TimeCount FLOAT,/*seconds indicating the time staying activated*/
	PRIMARY KEY (TargetID)
);

CREATE TABLE Team
(
	TeamID INT NOT NULL AUTO_INCREMENT,
	ScoreBoardID INT NOT NULL,
	ShotScore FLOAT,
	TargetHit INT,
	CurrentScore FLOAT,
	TeamName VARCHAR(20),
	NumOfPlayers INT,
	PRIMARY KEY (TeamID)
);

CREATE TABLE ScoreBoard
(
	ScoreBoardID INT NOT NULL AUTO_INCREMENT,
	WinningTeam VARCHAR(20) NOT NULL,/*This is team name that is winning*/
	GameName VARCHAR(20),/*Name of game that is happening*/
	TeamAFinalScore FLOAT,
	TeamBFinalScore FLOAT,
	TimeRemaining FLOAT,/*or remaining time*/
	PRIMARY KEY (ScoreBoardID)
);

CREATE TABLE Drone
(
	DroneID INT NOT NULL AUTO_INCREMENT,
	ScoreBoardID INT NOT NULL,
	TeamID INT NOT NULL,
	CurrentRole VARCHAR(7),
	AmmoLeft INT,
	Status VARCHAR(15),
	xCoord DOUBLE,
	yCoord DOUBLE,
	zCoord DOUBLE,
	ShotCount INT,
	HitCount INT,
	PRIMARY KEY (DroneID)
);

CREATE TABLE Player
(
	UserID INT NOT NULL,
	ScoreBoardID INT NOT NULL,
	TeamID INT NOT NULL,
	DroneID INT NOT NULL,
	PlayerFirstName VARCHAR(20),
	PlayerLastName VARCHAR(20),
	PlayerEmail VARCHAR(30)
);

CREATE TABLE Authenticate
(
	UserID INT NOT NULL AUTO_INCREMENT,
	PlayerUsername VARCHAR(20),
	PlayerPassword VARCHAR(40),
	Role VARCHAR(20),
	Salt VARCHAR(20),
	PRIMARY KEY (UserID)
);

CREATE TABLE Offense
(
	DroneID INT NOT NULL,
	ScoreBoardID INT NOT NULL,
	TeamID INT NOT NULL
);

CREATE TABLE Defense
(
	DroneID INT NOT NULL,
	ScoreBoardID INT NOT NULL,
	TeamID INT NOT NULL
);

/*Alter table statements, this adds constraints and foreign keys*/  
ALTER TABLE Team ADD CONSTRAINT FK_ScoreBoardID FOREIGN KEY (ScoreBoardID) REFERENCES ScoreBoard(ScoreBoardID);
ALTER TABLE Drone ADD CONSTRAINT FK_TeamID FOREIGN KEY (TeamID) REFERENCES Team(TeamID);
ALTER TABLE Drone ADD CONSTRAINT FK_ID FOREIGN KEY (ScoreBoardID) REFERENCES ScoreBoard(ScoreBoardID);
ALTER TABLE Offense ADD CONSTRAINT FK_Drone FOREIGN KEY (DroneID) REFERENCES Drone(DroneID);
ALTER TABLE Offense ADD CONSTRAINT FK_Score FOREIGN KEY (ScoreBoardID) REFERENCES ScoreBoard(ScoreBoardID);
ALTER TABLE Offense ADD CONSTRAINT FK_Teams FOREIGN KEY (TeamID) REFERENCES Team(TeamID);
ALTER TABLE Defense ADD CONSTRAINT FK_Drones FOREIGN KEY (DroneID) REFERENCES Drone(DroneID);
ALTER TABLE Defense ADD CONSTRAINT FK_Scores FOREIGN KEY (ScoreBoardID) REFERENCES ScoreBoard(ScoreBoardID);
ALTER TABLE Defense ADD CONSTRAINT FK_TheTeamID FOREIGN KEY (TeamID) REFERENCES Team(TeamID);
ALTER TABLE Player ADD CONSTRAINT FK_DroneID FOREIGN KEY (DroneID) REFERENCES Drone(DroneID);
ALTER TABLE Player ADD CONSTRAINT FK_UserID FOREIGN Key (UserID) REFERENCES Authenticate(UserID);
ALTER TABLE Player ADD CONSTRAINT FK_BoardID FOREIGN KEY (ScoreBoardID) REFERENCES ScoreBoard(ScoreBoardID);
ALTER TABLE Player ADD CONSTRAINT FK_Team FOREIGN KEY (TeamID) REFERENCES Team(TeamID);

/*DROP TABLE Target,Player,Defense,Offense,Drone,Team,ScoreBoard,Authenticate;*/
