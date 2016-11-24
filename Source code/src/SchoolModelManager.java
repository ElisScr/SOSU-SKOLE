import java.util.ArrayList;
/**
 * This class are used to set data : 
 * - list of topics by education
 * - list of education by School
 * - list of SchoolClasses by education and by School name
 * - list of Schools to a school list
 * 
 * @author Elis and Aleksander
 * @version 1.0, 26/05/2015
 */
public class SchoolModelManager
{
   public  static  ArrayList<School> GenerateSchoolsModel()
   {
      ArrayList<School> schools = new ArrayList<School>();
      
      //reusable data
      ArrayList<Topic> topics0 = new ArrayList<Topic>();
      topics0.add(new Topic("Social – og sundhedssektoren" ));
      topics0.add(new Topic("Pleje og dokumentation " ));
      topics0.add(new Topic("Psykologi og kommunikation" ));
      topics0.add(new Topic("Rehabilitering og social- og sundhedsfaglig indsats" ));
      topics0.add(new Topic("dansk " ));
      topics0.add(new Topic("naturfag " ));
      
      ArrayList<Topic> topics1 = new ArrayList<Topic>();
      topics1.add(new Topic("Aktivitets- og praktisk fagn" ));
      topics1.add(new Topic("dansk " ));
      topics1.add(new Topic("naturfag" ));
      topics1.add(new Topic("paedagogik med psykologi" ));
      topics1.add(new Topic("Social- og samfundsfag" ));
      topics1.add(new Topic("sundhedfag  " ));
      
      ArrayList<Topic> topics2 = new ArrayList<Topic>();
      topics2.add(new Topic("engelsk" ));
      topics2.add(new Topic("dansk " ));
      topics2.add(new Topic("naturfag" ));
      
      ArrayList<Topic> topics3 = new ArrayList<Topic>();
      topics3.add(new Topic("naturfag " ));
      topics3.add(new Topic("dansk " ));
      
      ArrayList<Topic> topics4 = new ArrayList<Topic>();
      topics4.add(new Topic("koordinering, kvalitetssikring og dokumentation" ));
      topics4.add(new Topic("sygepleje  " ));
      topics4.add(new Topic("somatisk sygdomslaere og farmakologi " ));
      topics4.add(new Topic("psykiatrisk sygdomslaere og farmakologi" ));
      topics4.add(new Topic("forebyggelse og rehabilitering" ));
      topics4.add(new Topic("sundhedspaedagogik og kommunikation" ));
      
      ArrayList<Topic> topics5 = new ArrayList<Topic>();
      topics5.add(new Topic("samfundsfag " ));
      topics5.add(new Topic("dansk " ));
      
      ArrayList<Topic> topics6 = new ArrayList<Topic>();
      topics6.add(new Topic("it og kommunikation " ));
      topics6.add(new Topic("kultur og aktivitetsfag " ));
      topics6.add(new Topic("paedagogik med psykologi " ));
      topics6.add(new Topic("sundhedsfag" ));
      
      ArrayList<Topic> topics7 = new ArrayList<Topic>();
      topics7.add(new Topic("samfundsfag " ));
      topics7.add(new Topic("dansk " ));
      
      ArrayList<Topic> topics8 = new ArrayList<Topic>();
      topics8.add(new Topic("paedagogik " ));
      topics8.add(new Topic("kultur og aktivitetsfag " ));
      topics8.add(new Topic("bevaegelse og idraet " ));
      topics8.add(new Topic("sundhedsfag " ));
      topics8.add(new Topic("sprog, kommunikation og psykologi" ));
      
      ArrayList<Topic> topics9 = new ArrayList<Topic>();
      topics9.add(new Topic("dansk" ));
      
      ArrayList<Topic> topics10 = new ArrayList<Topic>();
      topics10.add(new Topic("dansk" ));
      
      ArrayList<Topic> topics11 = new ArrayList<Topic>();
      topics11.add(new Topic("naturfag" ));
      topics11.add(new Topic("dansk" ));
     
      ArrayList<SchoolClass> school00Classes = new ArrayList<SchoolClass>();
      school00Classes.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school01Classes = new ArrayList<SchoolClass>();
      school01Classes.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school02Classes = new ArrayList<SchoolClass>();
      school02Classes.add(new SchoolClass( "2.1" ));
      school02Classes.add(new SchoolClass( "2.2" ));
      school02Classes.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school03Classes = new ArrayList<SchoolClass>();
      school03Classes.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school04Classes = new ArrayList<SchoolClass>();
      school04Classes.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school05Classes = new ArrayList<SchoolClass>();
      school05Classes.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school06Classes = new ArrayList<SchoolClass>();
      school06Classes.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school07Classes = new ArrayList<SchoolClass>();
      school07Classes.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school08Classes = new ArrayList<SchoolClass>();
      school08Classes.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school09Classes = new ArrayList<SchoolClass>();
      school09Classes.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school010Classes = new ArrayList<SchoolClass>();
      school010Classes.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school011Classes = new ArrayList<SchoolClass>();
      school011Classes.add(new SchoolClass( "11.1" ));

      Education ed0 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school00Classes );
      Education ed1 = new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school01Classes );
      Education ed2 = new Education( "Grundforlobet ", topics2, school02Classes );
      Education ed3 = new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school03Classes );
      Education ed4 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school04Classes );
      Education ed5 = new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school05Classes );
      Education ed6 = new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school06Classes );
      Education ed7 = new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school07Classes );
      Education ed8 = new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school08Classes );
      Education ed9 = new Education( "Grundforloeb 1  ", topics9, school09Classes );
      Education ed10 = new Education( "Grundforloeb 2 mod pau retning ", topics10, school010Classes );
      Education ed11 = new Education( "Grundforloeb 2mod ssh retning ", topics11, school011Classes );
      
      School school0 = new School ( "SOSU Nord", "SOSU_NORD" );
      school0.addEducation(ed0);
      school0.addEducation(ed1);
      school0.addEducation(ed2);
      school0.addEducation(ed3);
      school0.addEducation(ed4);
      school0.addEducation(ed5);
      school0.addEducation(ed6);
      school0.addEducation(ed7);
      school0.addEducation(ed8);
      school0.addEducation(ed9);
      school0.addEducation(ed10);
      school0.addEducation(ed11);
      
      ArrayList<SchoolClass> school0Classes = new ArrayList<SchoolClass>();
      school0Classes.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school1Classes = new ArrayList<SchoolClass>();
      school1Classes.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school2Classes = new ArrayList<SchoolClass>();
      school2Classes.add(new SchoolClass( "2.1" ));
      school2Classes.add(new SchoolClass( "2.2" ));
      school2Classes.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school3Classes = new ArrayList<SchoolClass>();
      school3Classes.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school4Classes = new ArrayList<SchoolClass>();
      school4Classes.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school5Classes = new ArrayList<SchoolClass>();
      school5Classes.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school6Classes = new ArrayList<SchoolClass>();
      school6Classes.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school7Classes = new ArrayList<SchoolClass>();
      school7Classes.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school8Classes = new ArrayList<SchoolClass>();
      school8Classes.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school9Classes = new ArrayList<SchoolClass>();
      school9Classes.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school10Classes = new ArrayList<SchoolClass>();
      school10Classes.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school11Classes = new ArrayList<SchoolClass>();
      school11Classes.add(new SchoolClass( "11.1" ));
      
      Education edu = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school0Classes );
      Education edu1 = new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school1Classes );
      Education edu2 = new Education( "Grundforlobet ", topics2, school2Classes );
      Education edu3 = new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school3Classes );
      Education edu4 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school4Classes );
      Education edu5 = new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school5Classes );
      Education edu6 = new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school6Classes );
      Education edu7 = new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school7Classes );
      Education edu8 = new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school8Classes );
      Education edu9 = new Education( "Grundforloeb 1  ", topics9, school9Classes );
      Education edu10 = new Education( "Grundforloeb 2 mod pau retning ", topics10, school10Classes );
      Education edu11 = new Education( "Grundforloeb 2mod ssh retning ", topics11, school11Classes );
      
      School school1 = new School (  "Social-og Sundhedsskolen Skive, Thisted, Viborg", "SOSU_STV" );
      school1.addEducation(edu);
      school1.addEducation(edu1);
      school1.addEducation(edu2);
      school1.addEducation(edu3);
      school1.addEducation(edu4);
      school1.addEducation(edu5);
      school1.addEducation(edu6);
      school1.addEducation(edu7);
      school1.addEducation(edu8);
      school1.addEducation(edu9);
      school1.addEducation(edu10);
      school1.addEducation(edu11);
      
      ArrayList<SchoolClass> school12Classes1 = new ArrayList<SchoolClass>();
      school12Classes1.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school13Classes2 = new ArrayList<SchoolClass>();
      school13Classes2.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school14Classes3 = new ArrayList<SchoolClass>();
      school14Classes3.add(new SchoolClass( "2.1" ));
      school14Classes3.add(new SchoolClass( "2.2" ));
      school14Classes3.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school15Classes4 = new ArrayList<SchoolClass>();
      school15Classes4.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school16Classes5 = new ArrayList<SchoolClass>();
      school16Classes5.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school17Classes6 = new ArrayList<SchoolClass>();
      school17Classes6.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school18Classes12 = new ArrayList<SchoolClass>();
      school18Classes12.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school20Classes7 = new ArrayList<SchoolClass>();
      school20Classes7.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school21Classes8 = new ArrayList<SchoolClass>();
      school21Classes8.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school22Classes9 = new ArrayList<SchoolClass>();
      school22Classes9.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school23Classes10 = new ArrayList<SchoolClass>();
      school23Classes10.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school24Classes11 = new ArrayList<SchoolClass>();
      school24Classes11.add(new SchoolClass( "11.1" ));
      
      Education edu12 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school12Classes1 );
      Education edu13 = new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school13Classes2 );
      Education edu14 = new Education( "Grundforlobet ", topics2, school14Classes3 );
      Education edu15 = new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school15Classes4 );
      Education edu16 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school16Classes5 );
      Education edu17 = new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school17Classes6 );
      Education edu18 = new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school18Classes12 );
      Education edu19 = new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school20Classes7 );
      Education edu20 = new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school21Classes8 );
      Education edu21 = new Education( "Grundforloeb 1  ", topics9, school22Classes9 );
      Education edu22 = new Education( "Grundforloeb 2 mod pau retning ", topics10, school23Classes10 );
      Education edu23 = new Education( "Grundforloeb 2mod ssh retning ", topics11, school24Classes11 );
      
      
      School school2 = new School (  "Randers Social-og Sundhedsskole", "SOSU_RANDERS" );
      school2.addEducation(edu12);
      school2.addEducation(edu13);
      school2.addEducation(edu14);
      school2.addEducation(edu15);
      school2.addEducation(edu16);
      school2.addEducation(edu17);
      school2.addEducation(edu18);
      school2.addEducation(edu19);
      school2.addEducation(edu20);
      school2.addEducation(edu21);
      school2.addEducation(edu22);
      school2.addEducation(edu23);
      
      
      ArrayList<SchoolClass> school25Classes1 = new ArrayList<SchoolClass>();
      school25Classes1.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school26Classes2 = new ArrayList<SchoolClass>();
      school26Classes2.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school27Classes3 = new ArrayList<SchoolClass>();
      school27Classes3.add(new SchoolClass( "2.1" ));
      school27Classes3.add(new SchoolClass( "2.2" ));
      school27Classes3.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school28Classes4 = new ArrayList<SchoolClass>();
      school28Classes4.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school29Classes5 = new ArrayList<SchoolClass>();
      school29Classes5.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school30Classes6 = new ArrayList<SchoolClass>();
      school30Classes6.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school31Classes12 = new ArrayList<SchoolClass>();
      school31Classes12.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school32Classes7 = new ArrayList<SchoolClass>();
      school32Classes7.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school33Classes8 = new ArrayList<SchoolClass>();
      school33Classes8.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school34Classes9 = new ArrayList<SchoolClass>();
      school34Classes9.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school35Classes10 = new ArrayList<SchoolClass>();
      school35Classes10.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school36Classes11 = new ArrayList<SchoolClass>();
      school36Classes11.add(new SchoolClass( "11.1" ));
      
      Education edu24 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school25Classes1 );
      Education edu25 = new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school26Classes2 );
      Education edu26 = new Education( "Grundforlobet ", topics2, school27Classes3 );
      Education edu27 = new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school28Classes4 );
      Education edu28 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school29Classes5 );
      Education edu29 = new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school30Classes6 );
      Education edu30 = new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school31Classes12 );
      Education edu31 = new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school32Classes7 );
      Education edu32 = new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school33Classes8 );
      Education edu33 = new Education( "Grundforloeb 1  ", topics9, school34Classes9 );
      Education edu34 = new Education( "Grundforloeb 2 mod pau retning ", topics10, school35Classes10 );
      Education edu35 = new Education( "Grundforloeb 2mod ssh retning ", topics11, school36Classes11 );
            
      School school3 = new School ( "Aarhus Social-og Sudhedsskole", "SOSU_AARHUS" );
      school3.addEducation(edu24);
      school3.addEducation(edu25);
      school3.addEducation(edu26);
      school3.addEducation(edu27);
      school3.addEducation(edu28);
      school3.addEducation(edu29);
      school3.addEducation(edu30);
      school3.addEducation(edu31);
      school3.addEducation(edu32);
      school3.addEducation(edu33);
      school3.addEducation(edu34);
      school3.addEducation(edu35);

      ArrayList<SchoolClass> school37Classes1 = new ArrayList<SchoolClass>();
      school37Classes1.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school38Classes2 = new ArrayList<SchoolClass>();
      school38Classes2.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school39Classes3 = new ArrayList<SchoolClass>();
      school39Classes3.add(new SchoolClass( "2.1" ));
      school39Classes3.add(new SchoolClass( "2.2" ));
      school39Classes3.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school40Classes4 = new ArrayList<SchoolClass>();
      school40Classes4.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school41Classes5 = new ArrayList<SchoolClass>();
      school41Classes5.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school42Classes6 = new ArrayList<SchoolClass>();
      school42Classes6.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school43Classes12 = new ArrayList<SchoolClass>();
      school43Classes12.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school44Classes7 = new ArrayList<SchoolClass>();
      school44Classes7.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school45Classes8 = new ArrayList<SchoolClass>();
      school45Classes8.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school46Classes9 = new ArrayList<SchoolClass>();
      school46Classes9.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school47Classes10 = new ArrayList<SchoolClass>();
      school47Classes10.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school49Classes11 = new ArrayList<SchoolClass>();
      school49Classes11.add(new SchoolClass( "11.1" ));
      
      Education edu36 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school37Classes1 );
      Education edu37 = new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school38Classes2 );
      Education edu38 = new Education( "Grundforlobet ", topics2, school39Classes3 );
      Education edu39 = new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school40Classes4 );
      Education edu40 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school41Classes5 );
      Education edu41 = new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school42Classes6 );
      Education edu42 = new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school43Classes12 );
      Education edu43 = new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school44Classes7 );
      Education edu44 = new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school45Classes8 );
      Education edu45 = new Education( "Grundforloeb 1  ", topics9, school46Classes9 );
      Education edu46 = new Education( "Grundforloeb 2 mod pau retning ", topics10, school47Classes10 );
      Education edu47 = new Education( "Grundforloeb 2mod ssh retning ", topics11, school49Classes11 );
     
      School school4 = new School ( "Social-og Sudhedsskolen, Silkeborg", "SOSU_SILKEBORG" );
      school4.addEducation(edu36);
      school4.addEducation(edu37);
      school4.addEducation(edu38);
      school4.addEducation(edu39);
      school4.addEducation(edu40);
      school4.addEducation(edu41);
      school4.addEducation(edu42);
      school4.addEducation(edu43);
      school4.addEducation(edu44);
      school4.addEducation(edu45);
      school4.addEducation(edu46);
      school4.addEducation(edu47);
   
      ArrayList<SchoolClass> school50Classes1 = new ArrayList<SchoolClass>();
      school50Classes1.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school51Classes2 = new ArrayList<SchoolClass>();
      school51Classes2.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school52Classes3 = new ArrayList<SchoolClass>();
      school52Classes3.add(new SchoolClass( "2.1" ));
      school52Classes3.add(new SchoolClass( "2.2" ));
      school52Classes3.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school53Classes4 = new ArrayList<SchoolClass>();
      school53Classes4.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school54Classes5 = new ArrayList<SchoolClass>();
      school54Classes5.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school55Classes6 = new ArrayList<SchoolClass>();
      school55Classes6.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school56Classes12 = new ArrayList<SchoolClass>();
      school56Classes12.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school57Classes7 = new ArrayList<SchoolClass>();
      school57Classes7.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school58Classes8 = new ArrayList<SchoolClass>();
      school58Classes8.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school59Classes9 = new ArrayList<SchoolClass>();
      school59Classes9.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school60Classes10 = new ArrayList<SchoolClass>();
      school60Classes10.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school61Classes11 = new ArrayList<SchoolClass>();
      school61Classes11.add(new SchoolClass( "11.1" ));
      
      Education edu48 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school50Classes1 );
      Education edu49 = new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school51Classes2 );
      Education edu50 = new Education( "Grundforlobet ", topics2, school52Classes3 );
      Education edu51 = new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school53Classes4 );
      Education edu52 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school54Classes5 );
      Education edu53 = new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school55Classes6 );
      Education edu54 = new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school56Classes12 );
      Education edu55 = new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school57Classes7 );
      Education edu56 = new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school58Classes8 );
      Education edu57 = new Education( "Grundforloeb 1  ", topics9, school59Classes9 );
      Education edu58 = new Education( "Grundforloeb 2 mod pau retning ", topics10, school60Classes10 );
      Education edu59 = new Education( "Grundforloeb 2mod ssh retning ", topics11, school61Classes11 );
    
      School school5 = new School ("Social-og Sudhedsskolen, Herning", "SOSU_HERNING");
      school5.addEducation(edu48);
      school5.addEducation(edu49);
      school5.addEducation(edu50);
      school5.addEducation(edu51);
      school5.addEducation(edu52);
      school5.addEducation(edu53);
      school5.addEducation(edu54);
      school5.addEducation(edu55);
      school5.addEducation(edu56);
      school5.addEducation(edu57);
      school5.addEducation(edu58);
      school5.addEducation(edu59);
      
      ArrayList<SchoolClass> school62Classes1 = new ArrayList<SchoolClass>();
      school62Classes1.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school63Classes2 = new ArrayList<SchoolClass>();
      school63Classes2.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school64Classes3 = new ArrayList<SchoolClass>();
      school64Classes3.add(new SchoolClass( "2.1" ));
      school64Classes3.add(new SchoolClass( "2.2" ));
      school64Classes3.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school65Classes4 = new ArrayList<SchoolClass>();
      school65Classes4.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school66Classes5 = new ArrayList<SchoolClass>();
      school66Classes5.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school67Classes6 = new ArrayList<SchoolClass>();
      school67Classes6.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school68Classes12 = new ArrayList<SchoolClass>();
      school68Classes12.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school69Classes7 = new ArrayList<SchoolClass>();
      school69Classes7.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school70Classes8 = new ArrayList<SchoolClass>();
      school70Classes8.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school71Classes9 = new ArrayList<SchoolClass>();
      school71Classes9.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school72Classes10 = new ArrayList<SchoolClass>();
      school72Classes10.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school73Classes11 = new ArrayList<SchoolClass>();
      school73Classes11.add(new SchoolClass( "11.1" ));
      
      Education edu60 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school62Classes1 );
      Education edu61 = new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school63Classes2 );
      Education edu62 = new Education( "Grundforlobet ", topics2, school64Classes3 );
      Education edu63 = new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school65Classes4 );
      Education edu64 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school66Classes5 );
      Education edu65 = new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school67Classes6 );
      Education edu66 = new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school68Classes12 );
      Education edu67 = new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school69Classes7 );
      Education edu68 = new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school70Classes8 );
      Education edu69 = new Education( "Grundforloeb 1  ", topics9, school71Classes9 );
      Education edu70 = new Education( "Grundforloeb 2 mod pau retning ", topics10, school72Classes10 );
      Education edu71 = new Education( "Grundforloeb 2mod ssh retning ", topics11, school73Classes11 );
      
      School school6 = new School ("Social-og Sudhedsskolen, Frederecia, Horsens", "SOSU_FH");
      school6.addEducation(edu60);
      school6.addEducation(edu61);
      school6.addEducation(edu62);
      school6.addEducation(edu63);
      school6.addEducation(edu64);
      school6.addEducation(edu65);
      school6.addEducation(edu66);
      school6.addEducation(edu67);
      school6.addEducation(edu68);
      school6.addEducation(edu69);
      school6.addEducation(edu70);
      school6.addEducation(edu71);
      
      ArrayList<SchoolClass> school74Classes1 = new ArrayList<SchoolClass>();
      school74Classes1.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school75Classes2 = new ArrayList<SchoolClass>();
      school75Classes2.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school76Classes3 = new ArrayList<SchoolClass>();
      school76Classes3.add(new SchoolClass( "2.1" ));
      school76Classes3.add(new SchoolClass( "2.2" ));
      school76Classes3.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school77Classes4 = new ArrayList<SchoolClass>();
      school77Classes4.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school78Classes5 = new ArrayList<SchoolClass>();
      school78Classes5.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school79Classes6 = new ArrayList<SchoolClass>();
      school79Classes6.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school80Classes12 = new ArrayList<SchoolClass>();
      school80Classes12.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school81Classes7 = new ArrayList<SchoolClass>();
      school81Classes7.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school82Classes8 = new ArrayList<SchoolClass>();
      school82Classes8.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school83Classes9 = new ArrayList<SchoolClass>();
      school83Classes9.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school84Classes10 = new ArrayList<SchoolClass>();
      school84Classes10.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school85Classes11 = new ArrayList<SchoolClass>();
      school85Classes11.add(new SchoolClass( "11.1" ));
      
      Education edu72 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school74Classes1 );
      Education edu73 = new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school75Classes2 );
      Education edu74 = new Education( "Grundforlobet ", topics2, school76Classes3 );
      Education edu75 = new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school77Classes4 );
      Education edu76 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school78Classes5 );
      Education edu77 = new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school79Classes6 );
      Education edu78 = new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school80Classes12 );
      Education edu79 = new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school81Classes7 );
      Education edu80 = new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school82Classes8 );
      Education edu81 = new Education( "Grundforloeb 1  ", topics9, school83Classes9 );
      Education edu82 = new Education( "Grundforloeb 2 mod pau retning ", topics10, school84Classes10 );
      Education edu83 = new Education( "Grundforloeb 2mod ssh retning ", topics11, school85Classes11 );
      
      School school7 = new School ("Social-og Sudhedsskolen, Esbjerg", "SOSU_ESBJERG");
      school7.addEducation(edu72);
      school7.addEducation(edu73);
      school7.addEducation(edu74);
      school7.addEducation(edu75);
      school7.addEducation(edu76);
      school7.addEducation(edu77);
      school7.addEducation(edu78);
      school7.addEducation(edu79);
      school7.addEducation(edu80);
      school7.addEducation(edu81);
      school7.addEducation(edu82);
      school7.addEducation(edu83);
      
      ArrayList<SchoolClass> school86Classes1 = new ArrayList<SchoolClass>();
      school86Classes1.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school87Classes2 = new ArrayList<SchoolClass>();
      school87Classes2.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school88Classes3 = new ArrayList<SchoolClass>();
      school88Classes3.add(new SchoolClass( "2.1" ));
      school88Classes3.add(new SchoolClass( "2.2" ));
      school88Classes3.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school89Classes4 = new ArrayList<SchoolClass>();
      school89Classes4.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school90Classes5 = new ArrayList<SchoolClass>();
      school90Classes5.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school91Classes6 = new ArrayList<SchoolClass>();
      school91Classes6.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school92Classes12 = new ArrayList<SchoolClass>();
      school92Classes12.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school93Classes7 = new ArrayList<SchoolClass>();
      school93Classes7.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school94Classes8 = new ArrayList<SchoolClass>();
      school94Classes8.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school95Classes9 = new ArrayList<SchoolClass>();
      school95Classes9.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school96Classes10 = new ArrayList<SchoolClass>();
      school96Classes10.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school97Classes11 = new ArrayList<SchoolClass>();
      school97Classes11.add(new SchoolClass( "11.1" ));
      
      Education edu84 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school86Classes1 );
      Education edu85 = new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school87Classes2 );
      Education edu86 = new Education( "Grundforlobet ", topics2, school88Classes3 );
      Education edu87 = new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school89Classes4 );
      Education edu88 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school90Classes5 );
      Education edu89 = new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school91Classes6 );
      Education edu90 = new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school92Classes12 );
      Education edu91 = new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school93Classes7 );
      Education edu92 = new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school94Classes8 );
      Education edu93 = new Education( "Grundforloeb 1  ", topics9, school95Classes9 );
      Education edu94 = new Education( "Grundforloeb 2 mod pau retning ", topics10, school96Classes10 );
      Education edu95 = new Education( "Grundforloeb 2mod ssh retning ", topics11, school97Classes11 );
      
      School school8 = new School ("Social-og Sudhedsskolen Syd", "SOSU_SYD");
      school8.addEducation(edu84);
      school8.addEducation(edu85);
      school8.addEducation(edu86);
      school8.addEducation(edu87);
      school8.addEducation(edu88);
      school8.addEducation(edu89);
      school8.addEducation(edu90);
      school8.addEducation(edu91);
      school8.addEducation(edu92);
      school8.addEducation(edu93);
      school8.addEducation(edu94);
      school8.addEducation(edu95);
      
      ArrayList<SchoolClass> school98Classes1 = new ArrayList<SchoolClass>();
      school98Classes1.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school99Classes2 = new ArrayList<SchoolClass>();
      school99Classes2.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school100Classes3 = new ArrayList<SchoolClass>();
      school100Classes3.add(new SchoolClass( "2.1" ));
      school100Classes3.add(new SchoolClass( "2.2" ));
      school100Classes3.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school101Classes4 = new ArrayList<SchoolClass>();
      school101Classes4.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school102Classes5 = new ArrayList<SchoolClass>();
      school102Classes5.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school103Classes6 = new ArrayList<SchoolClass>();
      school103Classes6.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school104Classes12 = new ArrayList<SchoolClass>();
      school104Classes12.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school105Classes7 = new ArrayList<SchoolClass>();
      school105Classes7.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school106Classes8 = new ArrayList<SchoolClass>();
      school106Classes8.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school107Classes9 = new ArrayList<SchoolClass>();
      school107Classes9.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school108Classes10 = new ArrayList<SchoolClass>();
      school108Classes10.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school109Classes11 = new ArrayList<SchoolClass>();
      school109Classes11.add(new SchoolClass( "11.1" ));
      
      Education edu96 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school98Classes1 );
      Education edu97 = new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school99Classes2 );
      Education edu98 = new Education( "Grundforlobet ", topics2, school100Classes3 );
      Education edu99 = new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school101Classes4 );
      Education edu100 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school102Classes5 );
      Education edu101= new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school103Classes6 );
      Education edu102= new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school104Classes12 );
      Education edu103= new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school105Classes7 );
      Education edu104= new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school106Classes8 );
      Education edu105= new Education( "Grundforloeb 1  ", topics9, school107Classes9 );
      Education edu106= new Education( "Grundforloeb 2 mod pau retning ", topics10, school108Classes10 );
      Education edu107= new Education( "Grundforloeb 2mod ssh retning ", topics11, school109Classes11 );
      
      School school9 = new School ("Social-og Sudhedsskolen Fyn", "SOSU_FYN");
      school9.addEducation(edu96);
      school9.addEducation(edu97);
      school9.addEducation(edu98);
      school9.addEducation(edu99);
      school9.addEducation(edu100);
      school9.addEducation(edu101);
      school9.addEducation(edu102);
      school9.addEducation(edu103);
      school9.addEducation(edu104);
      school9.addEducation(edu105);
      school9.addEducation(edu106);
      school9.addEducation(edu107);
     
      ArrayList<SchoolClass> school110Classes1 = new ArrayList<SchoolClass>();
      school110Classes1.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school111Classes2 = new ArrayList<SchoolClass>();
      school111Classes2.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school112Classes3 = new ArrayList<SchoolClass>();
      school112Classes3.add(new SchoolClass( "2.1" ));
      school112Classes3.add(new SchoolClass( "2.2" ));
      school112Classes3.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school113Classes4 = new ArrayList<SchoolClass>();
      school113Classes4.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school114Classes5 = new ArrayList<SchoolClass>();
      school114Classes5.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school115Classes6 = new ArrayList<SchoolClass>();
      school115Classes6.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school116Classes12 = new ArrayList<SchoolClass>();
      school116Classes12.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school117Classes7 = new ArrayList<SchoolClass>();
      school117Classes7.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school118Classes8 = new ArrayList<SchoolClass>();
      school118Classes8.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school119Classes9 = new ArrayList<SchoolClass>();
      school119Classes9.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school120Classes10 = new ArrayList<SchoolClass>();
      school120Classes10.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school122Classes11 = new ArrayList<SchoolClass>();
      school122Classes11.add(new SchoolClass( "11.1" ));
      
      Education edu108 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school110Classes1 );
      Education edu109= new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school111Classes2 );
      Education edu110= new Education( "Grundforlobet ", topics2, school112Classes3 );
      Education edu111= new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school113Classes4 );
      Education edu112 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school114Classes5 );
      Education edu113= new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school115Classes6 );
      Education edu114= new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school116Classes12 );
      Education edu115= new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school117Classes7 );
      Education edu116= new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school118Classes8 );
      Education edu117= new Education( "Grundforloeb 1  ", topics9, school119Classes9 );
      Education edu118= new Education( "Grundforloeb 2 mod pau retning ", topics10, school120Classes10 );
      Education edu119= new Education( "Grundforloeb 2mod ssh retning ", topics11, school122Classes11 );
     
      School school10 = new School ("Bornholms Sudheds-og Sygeplejeskole", "BH_SUND");
      school10.addEducation(edu108);
      school10.addEducation(edu109);
      school10.addEducation(edu110);
      school10.addEducation(edu111);
      school10.addEducation(edu112);
      school10.addEducation(edu113);
      school10.addEducation(edu114);
      school10.addEducation(edu115);
      school10.addEducation(edu116);
      school10.addEducation(edu117);
      school10.addEducation(edu118);
      school10.addEducation(edu119);
      
      ArrayList<SchoolClass> school110Classes123 = new ArrayList<SchoolClass>();
      school110Classes123.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school111Classes124 = new ArrayList<SchoolClass>();
      school111Classes124.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school112Classes125 = new ArrayList<SchoolClass>();
      school112Classes125.add(new SchoolClass( "2.1" ));
      school112Classes125.add(new SchoolClass( "2.2" ));
      school112Classes125.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school113Classes126 = new ArrayList<SchoolClass>();
      school113Classes126.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school114Classes127 = new ArrayList<SchoolClass>();
      school114Classes127.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school115Classes128 = new ArrayList<SchoolClass>();
      school115Classes128.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school116Classes1129 = new ArrayList<SchoolClass>();
      school116Classes1129.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school117Classes130 = new ArrayList<SchoolClass>();
      school117Classes130.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school118Classes131 = new ArrayList<SchoolClass>();
      school118Classes131.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school119Classes132 = new ArrayList<SchoolClass>();
      school119Classes132.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school120Classes133 = new ArrayList<SchoolClass>();
      school120Classes133.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school122Classes134 = new ArrayList<SchoolClass>();
      school122Classes134.add(new SchoolClass( "11.1" ));
      
      Education edu120 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school110Classes123 );
      Education edu121= new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school111Classes124 );
      Education edu122= new Education( "Grundforlobet ", topics2, school112Classes125 );
      Education edu123= new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school113Classes126 );
      Education edu124 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school114Classes127 );
      Education edu125= new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school115Classes128 );
      Education edu126= new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school116Classes1129 );
      Education edu127= new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school117Classes130 );
      Education edu128= new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school118Classes131 );
      Education edu129= new Education( "Grundforloeb 1  ", topics9, school119Classes132 );
      Education edu130= new Education( "Grundforloeb 2 mod pau retning ", topics10, school120Classes133 );
      Education edu131= new Education( "Grundforloeb 2mod ssh retning ", topics11, school122Classes134 );
      
      School school11 = new School ("Heilsuskull Føroya", "FO_HEILSUSKULL");
      school11.addEducation(edu120);
      school11.addEducation(edu121);
      school11.addEducation(edu122);
      school11.addEducation(edu123);
      school11.addEducation(edu124);
      school11.addEducation(edu125);
      school11.addEducation(edu126);
      school11.addEducation(edu127);
      school11.addEducation(edu128);
      school11.addEducation(edu129);
      school11.addEducation(edu130);
      school11.addEducation(edu131);
      
      ArrayList<SchoolClass> school110Classes135 = new ArrayList<SchoolClass>();
      school110Classes135.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school111Classes136 = new ArrayList<SchoolClass>();
      school111Classes136.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school112Classes137 = new ArrayList<SchoolClass>();
      school112Classes137.add(new SchoolClass( "2.1" ));
      school112Classes137.add(new SchoolClass( "2.2" ));
      school112Classes137.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school113Classes138 = new ArrayList<SchoolClass>();
      school113Classes138.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school114Classes139 = new ArrayList<SchoolClass>();
      school114Classes139.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school115Classes140 = new ArrayList<SchoolClass>();
      school115Classes140.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school116Classes1141 = new ArrayList<SchoolClass>();
      school116Classes1141.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school117Classes142 = new ArrayList<SchoolClass>();
      school117Classes142.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school118Classes143 = new ArrayList<SchoolClass>();
      school118Classes143.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school119Classes144 = new ArrayList<SchoolClass>();
      school119Classes144.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school120Classes145 = new ArrayList<SchoolClass>();
      school120Classes145.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school122Classes146 = new ArrayList<SchoolClass>();
      school122Classes146.add(new SchoolClass( "11.1" ));
      
      Education edu132 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school110Classes135 );
      Education edu133= new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school111Classes136 );
      Education edu134= new Education( "Grundforlobet ", topics2, school112Classes137 );
      Education edu135= new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school113Classes138 );
      Education edu136 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school114Classes139 );
      Education edu137= new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school115Classes140 );
      Education edu138= new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school116Classes1141 );
      Education edu139= new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school117Classes142 );
      Education edu140= new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school118Classes143 );
      Education edu141= new Education( "Grundforloeb 1  ", topics9, school119Classes144 );
      Education edu142= new Education( "Grundforloeb 2 mod pau retning ", topics10, school120Classes145 );
      Education edu143= new Education( "Grundforloeb 2mod ssh retning ", topics11, school122Classes146 );
      
      School school12 = new School ("SOPU København og Nordsjælland", "SO_PU");
      school12.addEducation(edu132);
      school12.addEducation(edu133);
      school12.addEducation(edu134);
      school12.addEducation(edu135);
      school12.addEducation(edu136);
      school12.addEducation(edu137);
      school12.addEducation(edu138);
      school12.addEducation(edu139);
      school12.addEducation(edu140);
      school12.addEducation(edu141);
      school12.addEducation(edu142);
      school12.addEducation(edu143);
      
      ArrayList<SchoolClass> school110Classes147 = new ArrayList<SchoolClass>();
      school110Classes147.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school111Classes148 = new ArrayList<SchoolClass>();
      school111Classes148.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school112Classes149 = new ArrayList<SchoolClass>();
      school112Classes149.add(new SchoolClass( "2.1" ));
      school112Classes149.add(new SchoolClass( "2.2" ));
      school112Classes149.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school113Classes150 = new ArrayList<SchoolClass>();
      school113Classes150.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school114Classes151 = new ArrayList<SchoolClass>();
      school114Classes151.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school115Classes152 = new ArrayList<SchoolClass>();
      school115Classes152.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school116Classes1153 = new ArrayList<SchoolClass>();
      school116Classes1153.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school117Classes154 = new ArrayList<SchoolClass>();
      school117Classes154.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school118Classes156 = new ArrayList<SchoolClass>();
      school118Classes156.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school119Classes157 = new ArrayList<SchoolClass>();
      school119Classes157.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school120Classes158 = new ArrayList<SchoolClass>();
      school120Classes158.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school122Classes159 = new ArrayList<SchoolClass>();
      school122Classes159.add(new SchoolClass( "11.1" ));
      
      Education edu144 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school110Classes147 );
      Education edu145= new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school111Classes148 );
      Education edu146= new Education( "Grundforlobet ", topics2, school112Classes149 );
      Education edu147= new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school113Classes150 );
      Education edu148 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school114Classes151 );
      Education edu149= new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school115Classes152 );
      Education edu150= new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school116Classes1153 );
      Education edu151= new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school117Classes154 );
      Education edu152= new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school118Classes156 );
      Education edu153= new Education( "Grundforloeb 1  ", topics9, school119Classes157 );
      Education edu154= new Education( "Grundforloeb 2 mod pau retning ", topics10, school120Classes158 );
      Education edu155= new Education( "Grundforloeb 2mod ssh retning ", topics11, school122Classes159 );
      
      School school13 = new School ("UC Diakonissen Social-og Sudhedsskole", "UC_DIAKONISSEN");
      school13.addEducation(edu144);
      school13.addEducation(edu145);
      school13.addEducation(edu146);
      school13.addEducation(edu147);
      school13.addEducation(edu148);
      school13.addEducation(edu149);
      school13.addEducation(edu150);
      school13.addEducation(edu151);
      school13.addEducation(edu152);
      school13.addEducation(edu153);
      school13.addEducation(edu154);
      school13.addEducation(edu155);
      
      ArrayList<SchoolClass> school110Classes160 = new ArrayList<SchoolClass>();
      school110Classes160.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school111Classes161 = new ArrayList<SchoolClass>();
      school111Classes161.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school112Classes162 = new ArrayList<SchoolClass>();
      school112Classes162.add(new SchoolClass( "2.1" ));
      school112Classes162.add(new SchoolClass( "2.2" ));
      school112Classes162.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school113Classes163 = new ArrayList<SchoolClass>();
      school113Classes163.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school114Classes164 = new ArrayList<SchoolClass>();
      school114Classes164.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school115Classes165 = new ArrayList<SchoolClass>();
      school115Classes165.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school116Classes1166 = new ArrayList<SchoolClass>();
      school116Classes1166.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school117Classes167 = new ArrayList<SchoolClass>();
      school117Classes167.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school118Classes168 = new ArrayList<SchoolClass>();
      school118Classes168.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school119Classes169 = new ArrayList<SchoolClass>();
      school119Classes169.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school120Classes170 = new ArrayList<SchoolClass>();
      school120Classes170.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school122Classes171 = new ArrayList<SchoolClass>();
      school122Classes171.add(new SchoolClass( "11.1" ));
      
      Education edu156 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school110Classes160 );
      Education edu157= new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school111Classes161 );
      Education edu158= new Education( "Grundforlobet ", topics2, school112Classes162 );
      Education edu159= new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school113Classes163 );
      Education edu160 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school114Classes164 );
      Education edu161= new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school115Classes165 );
      Education edu162= new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school116Classes1166 );
      Education edu163= new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school117Classes167 );
      Education edu164= new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school118Classes168 );
      Education edu165= new Education( "Grundforloeb 1  ", topics9, school119Classes169 );
      Education edu166= new Education( "Grundforloeb 2 mod pau retning ", topics10, school120Classes170 );
      Education edu167= new Education( "Grundforloeb 2mod ssh retning ", topics11, school122Classes171 );
      
      School school14 = new School ("SOSU C Social-og Sudhedsuddannelses Centret", "SOSU_C");
      school14.addEducation(edu156);
      school14.addEducation(edu157);
      school14.addEducation(edu158);
      school14.addEducation(edu159);
      school14.addEducation(edu160);
      school14.addEducation(edu161);
      school14.addEducation(edu162);
      school14.addEducation(edu163);
      school14.addEducation(edu164);
      school14.addEducation(edu165);
      school14.addEducation(edu166);
      school14.addEducation(edu167);
      
      ArrayList<SchoolClass> school110Classes172 = new ArrayList<SchoolClass>();
      school110Classes172.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school111Classes173 = new ArrayList<SchoolClass>();
      school111Classes173.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school112Classes174 = new ArrayList<SchoolClass>();
      school112Classes174.add(new SchoolClass( "2.1" ));
      school112Classes174.add(new SchoolClass( "2.2" ));
      school112Classes174.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school113Classes175 = new ArrayList<SchoolClass>();
      school113Classes175.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school114Classes176 = new ArrayList<SchoolClass>();
      school114Classes176.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school115Classes177 = new ArrayList<SchoolClass>();
      school115Classes177.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school116Classes1178 = new ArrayList<SchoolClass>();
      school116Classes1178.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school117Classes179 = new ArrayList<SchoolClass>();
      school117Classes179.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school118Classes180 = new ArrayList<SchoolClass>();
      school118Classes180.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school119Classes181 = new ArrayList<SchoolClass>();
      school119Classes181.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school120Classes182 = new ArrayList<SchoolClass>();
      school120Classes182.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school122Classes183 = new ArrayList<SchoolClass>();
      school122Classes183.add(new SchoolClass( "11.1" ));
      
      Education edu168 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school110Classes172 );
      Education edu169= new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school111Classes173 );
      Education edu170= new Education( "Grundforlobet ", topics2, school112Classes174 );
      Education edu171= new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school113Classes175 );
      Education edu172 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school114Classes176 );
      Education edu173= new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school115Classes177 );
      Education edu174= new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school116Classes1178 );
      Education edu175= new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school117Classes179 );
      Education edu176= new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school118Classes180 );
      Education edu177= new Education( "Grundforloeb 1  ", topics9, school119Classes181 );
      Education edu178= new Education( "Grundforloeb 2 mod pau retning ", topics10, school120Classes182 );
      Education edu179= new Education( "Grundforloeb 2mod ssh retning ", topics11, school122Classes183 );
      
      School school15 = new School ("SOSU Sjælland", "SOSU_SJ");
      school15.addEducation(edu168);
      school15.addEducation(edu169);
      school15.addEducation(edu170);
      school15.addEducation(edu171);
      school15.addEducation(edu172);
      school15.addEducation(edu173);
      school15.addEducation(edu174);
      school15.addEducation(edu175);
      school15.addEducation(edu176);
      school15.addEducation(edu177);
      school15.addEducation(edu178);
      school15.addEducation(edu179);
      
      ArrayList<SchoolClass> school110Classes184 = new ArrayList<SchoolClass>();
      school110Classes184.add(new SchoolClass( "0.1" ));
      
      ArrayList<SchoolClass> school111Classes185 = new ArrayList<SchoolClass>();
      school111Classes185.add(new SchoolClass( "1.1" ));
      
      ArrayList<SchoolClass> school112Classes186 = new ArrayList<SchoolClass>();
      school112Classes186.add(new SchoolClass( "2.1" ));
      school112Classes186.add(new SchoolClass( "2.2" ));
      school112Classes186.add(new SchoolClass( "2.3" ));
      
      ArrayList<SchoolClass> school113Classes187 = new ArrayList<SchoolClass>();
      school113Classes187.add(new SchoolClass( "3.1" ));
      
      ArrayList<SchoolClass> school114Classes188 = new ArrayList<SchoolClass>();
      school114Classes188.add(new SchoolClass( "4.1" ));
      
      ArrayList<SchoolClass> school115Classes189 = new ArrayList<SchoolClass>();
      school115Classes189.add(new SchoolClass( "5.1" ));
      
      ArrayList<SchoolClass> school116Classes1190 = new ArrayList<SchoolClass>();
      school116Classes1190.add(new SchoolClass( "6.1" ));
      
      ArrayList<SchoolClass> school117Classes191 = new ArrayList<SchoolClass>();
      school117Classes191.add(new SchoolClass( "7.1" ));
      
      ArrayList<SchoolClass> school118Classes192 = new ArrayList<SchoolClass>();
      school118Classes192.add(new SchoolClass( "8.1" ));
      
      ArrayList<SchoolClass> school119Classes193 = new ArrayList<SchoolClass>();
      school119Classes193.add(new SchoolClass( "9.1" ));
      
      ArrayList<SchoolClass> school120Classes194 = new ArrayList<SchoolClass>();
      school120Classes194.add(new SchoolClass( "10.1" ));
      
      ArrayList<SchoolClass> school122Classes196 = new ArrayList<SchoolClass>();
      school122Classes196.add(new SchoolClass( "11.1" ));
      
      Education edu180 = new Education( "Social-og sundhedshjaelperuddannelsen – ny ordning ", topics0, school110Classes184 );
      Education edu181= new Education( "Social-og sundhedshjaelperuddannelsen ", topics1, school111Classes185 );
      Education edu182= new Education( "Grundforlobet ", topics2, school112Classes186 );
      Education edu183= new Education( "Social-og sundhedsassistentuddannelsen (grundfag)  ", topics3, school113Classes187 );
      Education edu184 = new Education( "Social-og sundhedsassistentuddannelsen (omraadefag) –ny ordning ", topics4, school114Classes188 );
      Education edu185= new Education( "Den paedagogiske grunduddannelse (grundfag)", topics5, school115Classes189 );
      Education edu186= new Education( "Den paedagogiske grunduddannelse (omraadefag) ", topics6, school116Classes1190 );
      Education edu187= new Education( "Den paedagogiske assistentuddannelse (grundfag)  ", topics7, school117Classes191 );
      Education edu188= new Education( "Den paedagogiske assistentuddannelse (omraadefag)  ", topics8, school118Classes192 );
      Education edu189= new Education( "Grundforloeb 1  ", topics9, school119Classes193 );
      Education edu190= new Education( "Grundforloeb 2 mod pau retning ", topics10, school120Classes194 );
      Education edu191= new Education( "Grundforloeb 2mod ssh retning ", topics11, school122Classes196 );
      
      School school16 = new School ("SOSU Nykøbing F.", "SOSU_NYK");
      school16.addEducation(edu180);
      school16.addEducation(edu181);
      school16.addEducation(edu182);
      school16.addEducation(edu183);
      school16.addEducation(edu184);
      school16.addEducation(edu185);
      school16.addEducation(edu186);
      school16.addEducation(edu187);
      school16.addEducation(edu188);
      school16.addEducation(edu189);
      school16.addEducation(edu190);
      school16.addEducation(edu191);
     
      schools.add(school0);
      schools.add(school1);
      schools.add(school2);
      schools.add(school3);
      schools.add(school4);
      schools.add(school5);
      schools.add(school6);
      schools.add(school7);
      schools.add(school8);
      schools.add(school9);
      schools.add(school10);
      schools.add(school11);
      schools.add(school12);
      schools.add(school13);
      schools.add(school14);
      schools.add(school15);
      schools.add(school16);
   
     
      return schools;
   }
  
}
