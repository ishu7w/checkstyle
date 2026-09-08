/*
RegexpSinglelineJava
format = (?=MATCH)
message = (default)(null)
ignoreCase = (default)false
minimum = (default)0
maximum = (default)0
ignoreComments = true


*/

package com.puppycrawl.tools.checkstyle.checks.regexp.regexpsinglelinejava;

public class InputRegexpSinglelineJavaZeroWidth {
    // MATCH
    /* MATCH */
    /* MATCH */ int MATCH; // violation 'Line matches the illegal pattern'
    /* MATCH MATCH */ int MATCH2; // violation 'Line matches the illegal pattern'
    int MATCH3, MATCH4; // violation 'Line matches the illegal pattern'
}
