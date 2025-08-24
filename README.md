# 💬 Java Chat Application

🚀 A **multi-client chat application** built in **Java** using **TCP Sockets & Multithreading**.  
This project lets multiple users chat together in real-time over **localhost or LAN** 🌐.  

---

## 🎯 Features
✅ Multiple clients can connect at the same time  
✅ Messages are broadcast to **all clients** 📢  
✅ Unique usernames for each client 👤  
✅ Works on **localhost & LAN** (just change IP) 🖥️  
✅ Clean & simple console-based UI ⚡  

---

## 🖥️ How to Run

### 1️⃣ Compile the code
```sh
javac MultiChatServer.java MultiChatClient.java
```

### 2️⃣ Start the server
```sh
java MultiChatServer
```

### 3️⃣ Start one or more clients
```sh
java MultiChatClient
```

💡 Enter your username and start chatting 🎉

---

## 📂 Project Structure
```
Java-Chat-Application/
│── MultiChatServer.java   # Server program
│── MultiChatClient.java   # Client program
│── README.md              # Project description
│── .gitignore             # Ignore class files
│── LICENSE                # MIT License
```

---

## 📸 Demo Screenshots

### 🔹 Server Terminal
```
Multi-Client Chat Server started on port 12345
New client connected: /127.0.0.1
Aniket joined the chat.
Rushi joined the chat.
```

### 🔹 Client 1
```
Enter your username: Aniket
Server: 🔔 Rushi joined the chat!
Rushi: Hello everyone!
Aniket: Hi Rushi 👋
```

### 🔹 Client 2
```
Enter your username: Rushi
Server: 🔔 Aniket joined the chat!
Aniket: Hi Rushi 👋
Rushi: Hello everyone!
```

*(👉 Replace these code-blocks with actual screenshots if you upload images in `/screenshots` folder.)*

---

## 🛠️ Technologies Used
- ☕ Java  
- 🌐 TCP Sockets  
- 🔀 Multithreading  

---

## 🌟 Future Improvements
- 🎨 Add a GUI with **JavaFX / Swing**  
- ⏰ Show timestamps with each message  
- 📩 Add private messaging feature  
- 😃 Emoji support  

---

## 📜 License
This project is licensed under the **MIT License** 📝
