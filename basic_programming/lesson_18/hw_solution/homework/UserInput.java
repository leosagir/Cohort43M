����   A =
      java/lang/Object <init> ()V	  	 
   java/lang/System out Ljava/io/PrintStream;
      java/io/PrintStream println (Ljava/lang/String;)V  java/util/Scanner	     in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     nextLine ()Ljava/lang/String;
  ! " # nextInt ()I
  % & ' 
nextDouble ()D ) homework/UserInput Code LineNumberTable LocalVariableTable this Lhomework/UserInput; 	inputText &(Ljava/lang/String;)Ljava/lang/String; message Ljava/lang/String; scanner Ljava/util/Scanner; inputInt (Ljava/lang/String;)I I inputDouble (Ljava/lang/String;)D D 
SourceFile UserInput.java ! (           *   /     *� �    +        ,        - .    / 0  *   m     � +� � Y� � M,� N-�    +         
     ,   *     - .      1 2    3 4    / 2   5 6  *   m     � +� � Y� � M,�  >�    +              ,   *     - .      1 2    3 4    5 7   8 9  *   m     � +� � Y� � M,� $J)�    +              ,   *     - .      1 2    3 4    8 :   ;    <