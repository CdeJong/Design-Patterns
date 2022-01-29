package com.cdejong.patterns.composite;

public class CompositePattern {

    public static void main(String[] args) {
        /*
         * Element is the Interface for each element also called the Component in this pattern
         * ListElement and AnimalElement are Composites because they both can have children (leaves)
         * TextElement, ImageElement and BreakElement are the leaves of the tree, they cant have children
         *
         * because all the Elements implements the rules/methods from the Element interface they can be used in any order.
         */


        // create root element
        ListElement myWebsite = new ListElement();

        // create children
        TextElement welcomeText = new TextElement("Hey welcome to my first website!");
        ImageElement welcomeImage = new ImageElement("images/welcome.png", "welcome");
        BreakElement separatorBreak = new BreakElement();
        TextElement animalsText = new TextElement("These are some animals I like:");
        ListElement animalList = new ListElement();

        // create children for animalList (ImageElement with a TextElement as description.)
        Element tigerAnimal = new AnimalElement("images/tiger.png", "tiger", "they are cool!");
        Element spiderAnimal = new AnimalElement("images/spider.png", "spider", "scary :S");
        Element catAnimal = new AnimalElement("images/cat.png", "cat", "sooo cute");

        // add children to animalList
        animalList.addElement(tigerAnimal);
        animalList.addElement(spiderAnimal);
        animalList.addElement(catAnimal);

        // add created children to root (list)element
        myWebsite.addElement(welcomeText);
        myWebsite.addElement(welcomeImage);
        myWebsite.addElement(separatorBreak);
        myWebsite.addElement(animalsText);
        myWebsite.addElement(animalList);

        //print xml from myWebsite (depth is for pretty printing with tab indentation, should always be 0)
        myWebsite.printXML(0);

        System.out.println(); // separator

        //or just print xml from the animal list
        animalList.printXML(0);



    }

}
