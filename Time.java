package ie.tudublin;

import processing.core.PApplet;

public class Time extends PApplet
{
    UI ui;
    float x;
    float y;

    int s = second();//Values from 0-59
    int m = minute();//Values from 0-59
    int h = hour();//Values from 0-23

    public Time(UI ui, float x, float y)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
    }

    public void render()
    {
        ui.textSize(20);
        ui.strokeWeight(2);

        // Hour 
        ui.circle(360,600,70);//x,y,size
        
        if (h < 10)
        {   
            
            ui.text("0" + h, x, y);
        }
        else
        {
            ui.text(h, x, y);
        }
      
        // Minute
        ui.circle(490,600,70);
        if (m < 10)
        {
            ui.text("0" + m, x + 130, y);
        }
        else
        {
            ui.text(m, x + 130, y);
        }
      
        // Second
        ui.circle(620,600,70);
        if (s < 10)
        {
            ui.text("0" + s, x + 260, y);
        }
        else
        {
            ui.text(s, x + 260, y);
        } 
        
    }

    public void update()
    {
        s = second();
        m = minute();
        h = hour();
    }
}