# Mr Potato Head

An app that displays a “Mr. Potato Head” toy on the screen. 
The toy has several accessories and body parts that can be placed on it, such as eyes, nose, mouth, ears, hat, shoes, and so on.

Initially the app displays only the toy’s body, but if the user checks/unchecks any of the checkboxes below the toy, 
the corresponding body part or accessory should appear/disappear.

LAYOUT
For the layout of the checkboxes i used a gridlayout, which puts the checkboxes in rows/colomns. The Images are in a relative layout.
In order to be able to use the app in landscape mode activity_main.xml was copied 
(and specified that the second was for landscape mode by adding "land"). 

INTERACTION BETWEEN CHECKBOXES AND VIEWS
In the main xml i added "android:onClick="setvisibility"/>" for every checkbox, and android:visibility="invisible"/>. the former results in
the function setvisibility to be started when a checkbox is clicked, the latter results in the views initially being invisible until a box is
checked. In MainActivity.java i used a boolean "checked", and a switch with cases for each bodypart. the public function in MainActivity.java
is mainly inspired by https://developer.android.com/guide/topics/ui/controls/checkbox.html

FLAWS APP
-When mode is switched from portrait to landscape or back, the xml file runs again which results in all the views being set invisible, 
while the checkboxes are still checked. this is a result of the duplication of xml files instead of using e.g. a linear layout to enable 
portrait mode.

Koen Zijlstra

