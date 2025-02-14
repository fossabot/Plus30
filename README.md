# Plus30
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2FSerhatBasesgioglu%2FPlus30.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2FSerhatBasesgioglu%2FPlus30?ref=badge_shield)


Currently on development!

Plus30 aims to automate some tasks for the custom game lobbies (Centered around Howling Abyss).

# Current Features

- Blacklisting blocked players
- Creating lobby
- Filtering/entering lobbies

# Planned Features

- Lobby Presets
- Auto Invite
- Extensive Whitelist/Blacklist implementation
- Custom Stats
- Discord Integration (?)
- Custom Ban/Pick System For Champion Selection (?)

# TO DO

 Backend

- Change connector from sync to async
- Implement websocket (Currently some functions are called using timers (auto-kick system), websocket will call them when an event happens)
- Implement DTO

 Frontend

- Import frontend into an electron instance
- Organize components/scripts
- Add bootstrap for better design

 General

- Implement proper error handling
- Write unit test
- Implement security
- Implement automation for releases

# Setup

Release is not available, backend and frontend servers can be run on IntelliJ and VS Code respectively.

For creating an executable following is possible:

Backend->Jar (.\mvnw clean package)

Frontend->Build (npm run build)

Merge these in an Electron application, create the executable using electron builder.

# Issues / Contributions

You can reach me with following channels, I appreciate the use of Issues page though (https://github.com/SerhatBasesgioglu/Plus30/issues)

- Riot Id: AyDaKaR#Raven

- Discord: aydakar

# Disclaimer

I did not register the app to Developer Portal yet, use it at your own risk.
I am prioritizing the technologies that I am learning (Spring Boot, Electron, ReactJs) instead of focusing on performance, RAM usage and storage of the project will be relatively high.

Plus30 isn't endorsed by Riot Games and doesn't reflect the views or opinions of Riot Games or anyone officially involved in producing or managing Riot Games properties. Riot Games, and all associated properties are trademarks or registered trademarks of Riot Games, Inc.


## License
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2FSerhatBasesgioglu%2FPlus30.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2FSerhatBasesgioglu%2FPlus30?ref=badge_large)