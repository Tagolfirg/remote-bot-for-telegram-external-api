# Remote Bot for Telegram External Api
External API for Remote Bot for Telegram Android (https://remote-bot.com)

### How to add library to your project
Gradle
```
Add to dependencies

compile 'com.alexandershtanko.remotebotexternalapi:remotebotexternalapi:1.0.2'

```

### 1. Send Location
```Java
RemoteBotExternalAPI.sendLocation(Context context, float lat, float lng)
```
### 2. Send Audio
```Java
RemoteBotExternalAPI.sendAudio(Context context,String path)
```
### 3. Send Document
```Java
RemoteBotExternalAPI.sendDocument(Context context,String path)
```
### 4. Send Video
```Java
RemoteBotExternalAPI.sendVideo(Context context,String path)
```
### 5. Send Photo
```Java
RemoteBotExternalAPI.sendPhoto(Context context,String path)
```
### 6. Send Voice
```Java
RemoteBotExternalAPI.sendVoice(Context context,String path)
```
### 7. Send Message
```Java
RemoteBotExternalAPI.sendMessage(Context context,String text)
```
