package com.stuffwithstuff.bantam;

/**
 * A simple token class. These are generated by Lexer and consumed by Parser.
 */
public final class Token {
    private final TokenType mType;
    private final String mText;

    public Token(TokenType type, String text) {
        mType = type;
        mText = text;
    }

    public TokenType getType() {
        return mType;
    }

    public String getText() {
        return mText;
    }

    @Override
    public String toString() {
        return mText;
    }
}
