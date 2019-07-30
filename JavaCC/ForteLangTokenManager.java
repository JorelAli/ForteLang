/* Generated By:JavaCC: Do not edit this line. ForteLangTokenManager.java */
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/** Token Manager. */
public class ForteLangTokenManager implements ForteLangConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xf800L) != 0L)
         {
            jjmatchedKind = 25;
            return 23;
         }
         if ((active0 & 0x8000000L) != 0L)
            return 6;
         if ((active0 & 0x10L) != 0L)
         {
            jjmatchedKind = 3;
            return -1;
         }
         if ((active0 & 0x14000000L) != 0L)
         {
            jjmatchedKind = 3;
            return 44;
         }
         if ((active0 & 0x800000L) != 0L)
            return 1;
         return -1;
      case 1:
         if ((active0 & 0xe000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 25;
               jjmatchedPos = 1;
            }
            return 23;
         }
         if ((active0 & 0x10L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 3;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0x1800L) != 0L)
            return 23;
         return -1;
      case 2:
         if ((active0 & 0xe800L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 2;
            return 23;
         }
         return -1;
      case 3:
         if ((active0 & 0xe800L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 3;
            return 23;
         }
         return -1;
      case 4:
         if ((active0 & 0x6800L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 4;
            return 23;
         }
         if ((active0 & 0x8000L) != 0L)
            return 23;
         return -1;
      case 5:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 5;
            return 23;
         }
         if ((active0 & 0x6000L) != 0L)
            return 23;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 16);
      case 41:
         return jjStopAtPos(0, 17);
      case 43:
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 44:
         return jjStopAtPos(0, 22);
      case 45:
         return jjMoveStringLiteralDfa1_0(0x14000000L);
      case 46:
         return jjStopAtPos(0, 5);
      case 59:
         return jjStopAtPos(0, 24);
      case 61:
         return jjStartNfaWithStates_0(0, 23, 1);
      case 63:
         return jjStopAtPos(0, 6);
      case 64:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 91:
         return jjStopAtPos(0, 20);
      case 93:
         return jjStopAtPos(0, 21);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x7800L);
      case 123:
         return jjStopAtPos(0, 18);
      case 124:
         return jjStartNfaWithStates_0(0, 27, 6);
      case 125:
         return jjStopAtPos(0, 19);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 43:
         if ((active0 & 0x10L) != 0L)
            return jjStopAtPos(1, 4);
         break;
      case 62:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x6000L);
      case 110:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(2, 28);
         break;
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x6000L);
      case 120:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 23);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x6000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 101:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(5, 13, 23);
         break;
      case 116:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(5, 14, 23);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(6, 11, 23);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 44;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAddStates(0, 2);
                  }
                  else if ((0xac0000000000L & l) != 0L)
                  {
                     if (kind > 3)
                        kind = 3;
                  }
                  else if ((0x5000000000000000L & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                  }
                  else if (curChar == 35)
                     jjstateSet[jjnewStateCnt++] = 31;
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(20, 21);
                  else if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 8;
                  else if (curChar == 33)
                     jjCheckNAdd(1);
                  else if (curChar == 61)
                     jjCheckNAdd(1);
                  if (curChar == 45)
                     jjCheckNAddTwoStates(38, 39);
                  else if (curChar == 47)
                     jjAddStates(3, 5);
                  else if (curChar == 35)
                  {
                     if (kind > 29)
                        kind = 29;
                     jjCheckNAdd(25);
                  }
                  else if (curChar == 62)
                     jjCheckNAdd(1);
                  else if (curChar == 60)
                     jjCheckNAdd(1);
                  break;
               case 44:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(39, 40);
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAdd(38);
                  }
                  break;
               case 1:
                  if (curChar == 61 && kind > 1)
                     kind = 1;
                  break;
               case 2:
                  if (curChar == 60)
                     jjCheckNAdd(1);
                  break;
               case 3:
                  if (curChar == 62)
                     jjCheckNAdd(1);
                  break;
               case 4:
                  if (curChar == 61)
                     jjCheckNAdd(1);
                  break;
               case 5:
                  if (curChar == 33)
                     jjCheckNAdd(1);
                  break;
               case 8:
                  if (curChar == 38 && kind > 1)
                     kind = 1;
                  break;
               case 9:
                  if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if ((0xac0000000000L & l) != 0L && kind > 3)
                     kind = 3;
                  break;
               case 19:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(20, 21);
                  break;
               case 20:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(20, 21);
                  break;
               case 21:
                  if (curChar == 34 && kind > 10)
                     kind = 10;
                  break;
               case 23:
                  if ((0x3ff008000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 24:
                  if (curChar != 35)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAdd(25);
                  break;
               case 25:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAdd(25);
                  break;
               case 26:
                  if (curChar == 35)
                     jjCheckNAddTwoStates(27, 30);
                  break;
               case 27:
                  if ((0xfffffff7ffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(27, 30);
                  break;
               case 28:
                  if (curChar == 35 && kind > 30)
                     kind = 30;
                  break;
               case 29:
                  if (curChar == 35)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 35)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if (curChar == 35)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 32:
                  if (curChar == 35)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 33:
                  if (curChar == 47)
                     jjAddStates(3, 5);
                  break;
               case 34:
                  if (curChar == 43 && kind > 2)
                     kind = 2;
                  break;
               case 35:
                  if (curChar == 45 && kind > 2)
                     kind = 2;
                  break;
               case 36:
                  if (curChar == 47 && kind > 2)
                     kind = 2;
                  break;
               case 37:
                  if (curChar == 45)
                     jjCheckNAddTwoStates(38, 39);
                  break;
               case 38:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(38);
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(39, 40);
                  break;
               case 40:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(41, 42);
                  break;
               case 41:
                  if (curChar == 45)
                     jjCheckNAdd(42);
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAdd(42);
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07ffffffL & l) != 0L)
                  {
                     if (kind > 25)
                        kind = 25;
                     jjCheckNAdd(23);
                  }
                  else if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 6;
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 17;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 6:
                  if (curChar == 124 && kind > 1)
                     kind = 1;
                  break;
               case 7:
                  if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 11:
                  if (curChar == 101 && kind > 9)
                     kind = 9;
                  break;
               case 12:
                  if (curChar == 117)
                     jjCheckNAdd(11);
                  break;
               case 13:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 115)
                     jjCheckNAdd(11);
                  break;
               case 16:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 20:
                  jjAddStates(6, 7);
                  break;
               case 22:
                  if ((0x7fffffe07ffffffL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(23);
                  break;
               case 23:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(23);
                  break;
               case 25:
                  if (kind > 29)
                     kind = 29;
                  jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  jjAddStates(8, 9);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 20:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(6, 7);
                  break;
               case 25:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(8, 9);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 44 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   38, 39, 40, 34, 35, 36, 20, 21, 27, 30, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, "\53\53", "\56", "\77", null, null, null, null, 
"\151\156\143\154\165\144\145", "\151\156", "\151\155\160\165\162\145", "\151\155\160\157\162\164", 
"\100\145\170\145\143", "\50", "\51", "\173", "\175", "\133", "\135", "\54", "\75", "\73", null, 
"\55\76", "\174", "\55\76\76", null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1fffffffL, 
};
static final long[] jjtoSkip = {
   0x3e0000000L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[44];
static private final int[] jjstateSet = new int[88];
static protected char curChar;
/** Constructor. */
public ForteLangTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public ForteLangTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 44; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002400L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
