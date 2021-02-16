package com.stuffwithstuff.bantam;

public enum TokenType {
    LEFT_PAREN,
    RIGHT_PAREN,
    COMMA,
    ASSIGN,
    PLUS,
    MINUS,
    ASTERISK,
    SLASH,
    CARET,
    TILDE,
    BANG,
    QUESTION,
    COLON,
    NAME,
    EOF;

    /**
     * If the TokenType represents a punctuator (i.e. a token that can split an
     * identifier like '+', this will get its text.
     */
    public Character punctuator() {
        return switch (this) {
            case LEFT_PAREN -> '(';
            case RIGHT_PAREN -> ')';
            case COMMA -> ',';
            case ASSIGN -> '=';
            case PLUS -> '+';
            case MINUS -> '-';
            case ASTERISK -> '*';
            case SLASH -> '/';
            case CARET -> '^';
            case TILDE -> '~';
            case BANG -> '!';
            case QUESTION -> '?';
            case COLON -> ':';
            default -> null;
        };
    }
}
