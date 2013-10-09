CREATE TABLE Target
(
	TargetID INT NOT NULL AUTO_INCREMENT,
	HitCount INT,
	TargetStatus VARCHAR(15),
	TimeCount FLOAT,/*seconds indicating the time staying activated*/
	
	CONSTRAINT PKTarget PRIMARY KEY (TargetID)
);

CREATE TABLE Team
(
	TeamID INT NOT NULL AUTO_INCREMENT,
	ShotScore FLOAT,
	TargetHit INT,
	CurrentScore FLOAT,
	TeamName VARCHAR(20),
	NumOfPlayers INT,
	ScoreBoardID INT,
	
	CONSTRAINT FKScoreBoardID FOREIGN KEY (ScoreBoardID) REFERENCES ScoreBoard,
	CONSTRAINT PKTeam PRIMARY KEY (TeamID)
);

CREATE TABLE ScoreBoard
(
	ScoreBoardID INT NOT NULL AUTO_INCREMENT,
	GameName VARCHAR(20) NOT NULL,/*Name of game that is happening*/
	TeamName VARCHAR(20),/*This is team name that is winning*/
	TeamAFinalScore FLOAT,
	TeamBFinalScore FLOAT,
	TimeRemaining FLOAT,/*or remaining time*/

	CONSTRAINT PKScoreBoard PRIMARY KEY (ScoreBoardID),
	CONSTRAINT FKTeamName FOREIGN KEY (TeamName) REFERENCES Team
);

CREATE TABLE Drone
(
	DroneID INT NOT NULL AUTO_INCREMENT,
	CurrentRole VARCHAR(7),
	AmmoLeft INT,
	Status VARCHAR(15),
	xCoord DOUBLE,
	yCoord DOUBLE,
	zCoord DOUBLE,
	ShotCount INT,
	HitCount INT,
	ScoreBoardID INT,
	TeamID INT,
	
	CONSTRAINT FKScoreBoardID FOREIGN KEY (ScoreBoardID) REFERENCES ScoreBoard,
	CONSTRAINT FKTeamID FOREIGN KEY (TeamID) REFERENCES Team,
	CONSTRAINT PKDrone PRIMARY KEY (DroneID)
);

CREATE TABLE Offense
(
	ScoreBoardID INT,
	TeamID INT,
	DroneID INT,
	
	CONSTRAINT FKScoreBoardID FOREIGN KEY (ScoreBoardID) REFERENCES ScoreBoard,
	CONSTRAINT FKTeamID FOREIGN KEY (TeamID) REFERENCES Team,
	CONSTRAINT FKDroneID FOREIGN KEY (DroneID) REFERENCES Drone,
	CONSTRAINT PKOffense PRIMARY KEY (DroneID)
);

CREATE TABLE Defense
(
	ScoreBoardID INT,
	TeamID INT,
	DroneID INT,
	
	CONSTRAINT FKScoreBoardID FOREIGN KEY (ScoreBoardID) REFERENCES ScoreBoard,
	CONSTRAINT FKTeamID FOREIGN KEY (TeamID) REFERENCES Team,
	CONSTRAINT FKDroneID FOREIGN KEY (DroneID) REFERENCES Drone,
	CONSTRAINT PKDefense PRIMARY KEY (DroneID)
);

CREATE TABLE Player
(
	PlayerID INT NOT NULL AUTO_INCREMENT,
	PlayerFirstName VARCHAR(20),
	PlayerLastName VARCHAR(20),
	PlayerEmail VARCHAR(30),
	ScoreBoardID INT,
	TeamID INT,
	DroneID INT,
	
	CONSTRAINT FKScoreBoardID FOREIGN KEY (ScoreBoardID) REFERENCES ScoreBoard,
	CONSTRAINT FKTeamID FOREIGN KEY (TeamID) REFERENCES Team,
	CONSTRAINT FKDroneID FOREIGN KEY (DroneID) REFERENCES Drone,
	CONSTRAINT PKPlayer PRIMARY KEY (PlayerID)
);

CREATE TABLE Authenticate
(
	PlayerID INT,
	PlayerUsername VARCHAR(20),
	PlayerPassword VARCHAR(40),
	
	CONSTRAINT FKPlayerID FOREIGN KEY (PlayerID) REFERENCES Player,
	CONSTRAINT PKAuthenticate PRIMARY KEY (PlayerID)
);

/*DROP TABLE Target,Player,Defense,Offense,Drone,Team,ScoreBoard,Authenticate;*/
