/* Config:                                                            //indent:0 exp:0
 * arrayInitIndent = 0                                                //indent:1 exp:1
 * basicOffset = 2                                                    //indent:1 exp:1
 * lineWrappingIndentation = 0                                        //indent:1 exp:1
 * tabWidth = 8                                                       //indent:1 exp:1
 */                                                                   //indent:1 exp:1
package com.puppycrawl.tools.checkstyle.checks.indentation.indentation;//indent:0 exp:0

@Α(/* 😀 */ { "first",                                                 //indent:0 exp:0
             "second"})                                               //indent:13 exp:13
class InputIndentationAnnotationArraySupplementary {                  //indent:0 exp:0
}                                                                     //indent:0 exp:0

@Α(/* 😀 */ { "first",                                                 //indent:0 exp:0
            "second"})                                                //indent:12 exp:0,11,13 warn
class AnnotationArraySupplementaryIncorrect {                         //indent:0 exp:0
}                                                                     //indent:0 exp:0

@Α(/* A */ { "first",                                                 //indent:0 exp:0
             "second"})                                               //indent:13 exp:13
class AnnotationArrayBmp {                                            //indent:0 exp:0
}                                                                     //indent:0 exp:0

@interface Α {                                                        //indent:0 exp:0
  String[] value();                                                   //indent:2 exp:2
}                                                                     //indent:0 exp:0
