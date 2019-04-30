package ie.tudublin;

import processing.core.PApplet;

public class Spider extends PApplet
{
    UI ui;
    int i;
    float x = 1;

    public Spider(UI ui){
        this.ui = ui;
    }

    public void drawSpider() 
    {
        //Draw Head of Spider
        ui.fill(0,0,255);
        ui.ellipse(500, 300 , 100, 100);//(x,y,width,height)

        //Draw Body of Spider
        ui.ellipse(500, 450 , 200, 200);

        //Draw Left Legs of Spider
       
            ui.line(415,400,340,380);//x1,y1,x2,y2
            ui.line(340,380,270,400);

            ui.line(400,450,320,430);
            ui.line(320,430,250,450);

            ui.line(415,505,340,485);
            ui.line(340,485,270,500);

        //Draw Right Legs of Spider
            ui.line(585,400,660,380);//x1,y1,x2,y2
            ui.line(660,380,730,400);

            ui.line(600,450,680,430);
            ui.line(680,430,750,450);

            ui.line(585,500,660,485);
            ui.line(660,485,730,500);

    }	
	

}