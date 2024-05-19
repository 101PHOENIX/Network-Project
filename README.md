# Network-Project
 First, I created my SQL database and created a Login JFrame. Then I created the create new user JFrame to get the user. After registering the users in the SQL database, I separated the project creator and participants tabs in the main bridge section. To create the project, it is sufficient to enter a unique name in the relevant txt section. After the project is created, the system generates random key values for each project and saves these values in the projects table. There cannot be more than one project with the same key value. Project owners can see their own projects and the key values corresponding to the projects. Whether the user is the project owner or the participant, he can see the project names and Project IDs in which he participated in the participating tab. In order to participate in the project, one can participate in the project by obtaining the project key from the project owner and typing in the relevant txt. Project owners and participants connect to the same client interface. Only people who own the project have to connect to the server and start the server. Whether the user is a project owner or a participant, he/she must connect his/her client to the server after the server is started, otherwise messaging is not possible. The user connected to the server can start messaging after seeing who owns the project. The CurrentUser class is used to distinguish whether the relevant user in the system is the project owner or the person participating in the project. If he has created a project in the projects table, compare the current user value with the values in the project_owner column corresponding to the project name he created in the projects table, and if they match, he is the project owner. If not, you will be presented with the message "There is no such project owner". File and emoji support is out of date despite all efforts. An attempt was made to provide emoji support to the project using JCombobox, but no successful results were achieved. An attempt was made to transfer files between clients using the drag and drop option, but it was not successful.