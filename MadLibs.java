public class MadLibs {
  /*
  This program generates a mad libbed story.
  Author:Laura
  Data:2/19/2049
  */
  	public static void main(String[] args){
      String name1 = "______";
      String adjective1 = "_______";
      String adjective2 = "_______ ";
      String adjective3 = "________ ";
      String verb1 = "________ ";
      String noun1 = "________"; 
      String noun2 = "_________ ";   
      String noun3 = "_________";   
      String noun4 = "________";   
      String noun5 = "_________";  
      String noun6 = "_______";
      String name2 = "________";
      int number = 2003;
      String place1 = "_______";

      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      System.out.println(story);
    }       
}
