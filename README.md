# SciFi UI Project

Name: Jerricho Juliano

Student Number: C17331306


# Description of the assignment
The Task of this assignment was to create a SciFi user interface using the knowledge we know from Java and Processing. I decided to go on a design that is somewhat related to spiderman since I thouroughly enjoy the movies. So I decided to go along with this theme in the end.

# Instructions
There is not much interactivity with the user interface as it is mainly just visual.

1)The 3 circles at the bottom of the screen represent the time and it constantly updates the actual time as it were in real life when the program is run.

2)The radar at the bottom right corner and the spider in the middle of the screen are just drawings and no interactivity.

3)The buttons at the top left of the screen shows the different types of suits and if it is clicked it shows the data of the suit that is clicked on 

# How it works
The spider in the middle of the screen was drawn by the use of a spider class and just simple processing references such as ellipse() and line().

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

The time at the bottom middle of the screen displays the current system time from the computer system

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

The tables located at the top left and right of the screen


```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```


# What I am most proud of in the assignment
Even though the user interface is very basic and simplistic, I have grasped a decent understanding of how java and processing works

# Images

This is an image using a relative URL:

![An image](images/p8.png)

# Youtube
[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)








