# Hey!
This is my submission for Application Assignment 1 [Part 1].

The basic design of the To-Do manager works by creating tabs with JavaFx tables in them, composed of
ToDoEntry objects. 
Each ToDoEntry object has a description, a due date, and completion flag.
Each list is represented as a Tab in the GUI, the content of which is controlled by an
FXML controller called TabController. 
The title requirement is met by allowing the name of the tab to be renamed.
Each tab exists inside an AnchorPane in the main window, based around a .fxml file controlled by a controller called
MenuController

I plan to handle File I/O by using .csv files because I believe it will be easier.
I may end up opting for .json parsing using Gson, since it wasn't that hard to use before.

JUnit5 testing was harder at this stage, since I'm making a lot of the functionality occur in void returning methods.
I did however meet this requirement by incorporating a test for my ToDoEntry object. Other tests will indeed be added,
however I would need to code a bit to pull methods out of the functions. If you take off points,
I'll see you in grade court.