# MyTwitterApp

# HOME PAGE
This is the first activity that the user sees upon launch of the app.
It contains a RecyclerView and a FloatingActionButton.
Clicking on an item leads the user to the 2nd activity.
Clicking on the FloatingActionButton leads the user to the 3rd activity.
You must use a RecyclerView. 
Implementing otherwise in terms of displaying the data will not receive partial points.
DATA IS PROVIDED
As seen from the list, a tweet contains:
Display name (in bold)
User name (w/ the @ symbol)
Date posted (w/o date)
Caption
Likes (w/ “Likes” appended)
Image
You might want to specify the height and/or width to make the images small in case they don’t display accordingly on your devices.
CLASSES ARE PROVIDED
Try to replicate the item layout as best as you can.
Changing of colors isn’t needed, but at least try to change the icon of the FloatingActionButton to some icon that denotes added, editing, or writing.
In case you’re wondering, the icon used in the demo is @android:drawable/ic_menu_edit, although you don’t have to use this.
Upon adding a Tweet, the tweet should come from “you” and should be found at the top of the list when returning to this activity.
When creating this tweet, kindly supply your own details for the display name, username, and image.
The data supplied doesn’t necessarily need to reflect yourself. Please don’t include information you’d feel uncomfortable sharing.
A new Tweet should have likes set to zero and a date posted to the current date.
Please check the 2nd constructor of the provided Tweet class provided.

# POST PAGE
The user arrives on this screen upon clicking a tweet or row in the RecyclerView.
Not that the information here is almost the same as the information found in the RecyclerView.
The main difference is in the layout as the views are aligned differently and are generally bigger than that from the row.
Use your own judgement to try to replicate the layout.
Please note that one difference here with the data in the 1st activity is that the date displays the year.
Recall, the date in the RecyclerView should only display the month and day.
Clicking the system’s back button brings the user back to the 1st activity.
Please avoid overriding the onBackPressed method

# CREATE POST PAGE
The user arrives on this screen upon clicking the FloatingActionButton in the 1st activity.
THIS LAYOUT IS PROVIDED IN THE FILES BELOW.
ALSO, THE SOURCE CODE FOR THE ACTIVITY IS ALSO PROVIDED.
Just note that it's not complete.
The View with a “What’s happening” hint is an EditText.
There are two (2) buttons:
Cancel -> brings the user back to the 1st activity without tweeting anything
Tweet -> sends whatever is in the EditText as a Tweet and returns to the 1st activity. The created tweet must be at the top of the RecyclerView.
Please note that sending a tweet without any text is not allowed. If this happened, kindly show a Toast explaining that they need to write something for the tweet to be sent. This is shown in the demo video.
There is also an ImageView
As this doesn’t change, you can modify it here or in the Activity.
Please make sure that the image provided here is consistent with what is shown in the RecyclerView and vice versa.
Clicking the system’s back button brings the user back to the 1st activity.
Please avoid overriding the onBackPressed method.
