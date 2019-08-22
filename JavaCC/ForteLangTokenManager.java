/* Generated By:JavaCC: Do not edit this line. ForteLangTokenManager.java */
import java.util.LinkedList;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.ByteArrayInputStream;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.math.BigDecimal;
import java.math.RoundingMode;

/** Token Manager. */
public class ForteLangTokenManager implements ForteLangConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x400000000000L) != 0L)
            return 46;
         if ((active0 & 0x90000000000L) != 0L)
         {
            jjmatchedKind = 4;
            return 49;
         }
         if ((active0 & 0x60008000000L) != 0L)
            return 6;
         if ((active0 & 0x37000fe000L) != 0L)
         {
            jjmatchedKind = 39;
            return 31;
         }
         if ((active0 & 0x10000000L) != 0L)
            return 1;
         if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 39;
            return 17;
         }
         if ((active0 & 0x20L) != 0L)
         {
            jjmatchedKind = 4;
            return -1;
         }
         return -1;
      case 1:
         if ((active0 & 0x6000L) != 0L)
            return 31;
         if ((active0 & 0x3f000f8000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 39;
               jjmatchedPos = 1;
            }
            return 31;
         }
         if ((active0 & 0x20L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 4;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 2:
         if ((active0 & 0x1a000fa000L) != 0L)
         {
            jjmatchedKind = 39;
            jjmatchedPos = 2;
            return 31;
         }
         if ((active0 & 0x2500000000L) != 0L)
            return 31;
         return -1;
      case 3:
         if ((active0 & 0xfa000L) != 0L)
         {
            jjmatchedKind = 39;
            jjmatchedPos = 3;
            return 31;
         }
         if ((active0 & 0x1a00000000L) != 0L)
            return 31;
         return -1;
      case 4:
         if ((active0 & 0x18000L) != 0L)
            return 31;
         if ((active0 & 0xe2000L) != 0L)
         {
            jjmatchedKind = 39;
            jjmatchedPos = 4;
            return 31;
         }
         return -1;
      case 5:
         if ((active0 & 0xe0000L) != 0L)
            return 31;
         if ((active0 & 0x2000L) != 0L)
         {
            if (jjmatchedPos != 5)
            {
               jjmatchedKind = 39;
               jjmatchedPos = 5;
            }
            return 31;
         }
         return -1;
      case 6:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 39;
            jjmatchedPos = 6;
            return 31;
         }
         if ((active0 & 0x2000L) != 0L)
            return 31;
         return -1;
      case 7:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 39;
            jjmatchedPos = 7;
            return 31;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 32:
         jjmatchedKind = 52;
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 35:
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 40:
         return jjStopAtPos(0, 20);
      case 41:
         return jjStopAtPos(0, 21);
      case 43:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 44:
         return jjStopAtPos(0, 24);
      case 45:
         return jjMoveStringLiteralDfa1_0(0x90000000000L);
      case 46:
         return jjStopAtPos(0, 6);
      case 58:
         return jjStopAtPos(0, 38);
      case 59:
         return jjStopAtPos(0, 29);
      case 61:
         return jjStartNfaWithStates_0(0, 28, 1);
      case 63:
         return jjStopAtPos(0, 7);
      case 64:
         return jjMoveStringLiteralDfa1_0(0xf0000L);
      case 91:
         return jjStopAtPos(0, 22);
      case 93:
         return jjStopAtPos(0, 23);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x6000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x2400000000L);
      case 123:
         return jjStopAtPos(0, 30);
      case 124:
         jjmatchedKind = 42;
         return jjMoveStringLiteralDfa1_0(0x20008000000L);
      case 125:
         return jjStopAtPos(0, 31);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 43:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(1, 5);
         break;
      case 62:
         if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000L);
      case 91:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStopAtPos(1, 46);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x400010000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000c0000L);
      case 110:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x900000000L);
      case 123:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 125:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
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
         if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(2, 43);
         break;
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 109:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(2, 32, 31);
         break;
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000c0000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000L);
      case 114:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 37, 31);
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 116:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(2, 34, 31);
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 120:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 124:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(2, 26);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
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
      case 99:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(3, 35, 31);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 108:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 36, 31);
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0xc0000L);
      case 116:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(3, 33, 31);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
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
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 31);
         break;
      case 104:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 31);
         break;
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0xc2000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
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
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      case 116:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(5, 17, 31);
         else if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
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
      case 98:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000L);
      case 101:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(6, 13, 31);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 120:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(8, 19, 31);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
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
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 49;
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
               case 46:
                  if (curChar == 35)
                  {
                     if (kind > 45)
                        kind = 45;
                     jjCheckNAdd(48);
                  }
                  if (curChar == 35)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 17:
               case 31:
                  if ((0x3ff008000000000L & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(31);
                  break;
               case 49:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(38, 39);
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 8)
                        kind = 8;
                     jjCheckNAdd(37);
                  }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 8)
                        kind = 8;
                     jjCheckNAddStates(0, 2);
                  }
                  else if ((0xac2000000000L & l) != 0L)
                  {
                     if (kind > 4)
                        kind = 4;
                  }
                  else if ((0x5000000000000000L & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                  }
                  else if (curChar == 35)
                     jjAddStates(3, 4);
                  else if (curChar == 39)
                     jjCheckNAddStates(5, 7);
                  else if (curChar == 34)
                     jjCheckNAddStates(8, 10);
                  else if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 8;
                  else if (curChar == 33)
                     jjCheckNAdd(1);
                  else if (curChar == 61)
                     jjCheckNAdd(1);
                  if (curChar == 45)
                     jjCheckNAddTwoStates(37, 38);
                  else if (curChar == 47)
                     jjAddStates(11, 13);
                  else if (curChar == 62)
                     jjCheckNAdd(1);
                  else if (curChar == 60)
                     jjCheckNAdd(1);
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
                  if (curChar == 38 && kind > 2)
                     kind = 2;
                  break;
               case 9:
                  if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if ((0xac2000000000L & l) != 0L && kind > 4)
                     kind = 4;
                  break;
               case 19:
                  if (curChar == 34)
                     jjCheckNAddStates(8, 10);
                  break;
               case 21:
                  jjCheckNAddStates(8, 10);
                  break;
               case 22:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 23:
                  if (curChar == 34 && kind > 11)
                     kind = 11;
                  break;
               case 24:
                  if (curChar == 39)
                     jjCheckNAddStates(5, 7);
                  break;
               case 26:
                  jjCheckNAddStates(5, 7);
                  break;
               case 27:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddStates(5, 7);
                  break;
               case 28:
                  if (curChar == 39 && kind > 12)
                     kind = 12;
                  break;
               case 32:
                  if (curChar == 47)
                     jjAddStates(11, 13);
                  break;
               case 33:
                  if (curChar == 43 && kind > 3)
                     kind = 3;
                  break;
               case 34:
                  if (curChar == 45 && kind > 3)
                     kind = 3;
                  break;
               case 35:
                  if (curChar == 47 && kind > 3)
                     kind = 3;
                  break;
               case 36:
                  if (curChar == 45)
                     jjCheckNAddTwoStates(37, 38);
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAdd(37);
                  break;
               case 38:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(38, 39);
                  break;
               case 39:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(40, 41);
                  break;
               case 40:
                  if (curChar == 45)
                     jjCheckNAdd(41);
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAdd(41);
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddStates(0, 2);
                  break;
               case 43:
                  if (curChar == 35)
                     jjAddStates(3, 4);
                  break;
               case 45:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 47:
                  if (curChar != 35)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjCheckNAdd(48);
                  break;
               case 48:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjCheckNAdd(48);
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
               case 17:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 39)
                        kind = 39;
                     jjCheckNAdd(31);
                  }
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 0:
                  if ((0x7fffffe07ffffffL & l) != 0L)
                  {
                     if (kind > 39)
                        kind = 39;
                     jjCheckNAdd(31);
                  }
                  else if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 6;
                  if ((0x87fffffeL & l) != 0L)
                  {
                     if (kind > 25)
                        kind = 25;
                     jjCheckNAdd(29);
                  }
                  else if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 17;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 6:
                  if (curChar == 124 && kind > 2)
                     kind = 2;
                  break;
               case 7:
                  if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 11:
                  if (curChar == 101 && kind > 10)
                     kind = 10;
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
               case 18:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 20:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 21:
                  jjCheckNAddStates(8, 10);
                  break;
               case 22:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 25:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 26:
                  jjCheckNAddStates(5, 7);
                  break;
               case 27:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(5, 7);
                  break;
               case 29:
                  if ((0x87fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(29);
                  break;
               case 30:
                  if ((0x7fffffe07ffffffL & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(31);
                  break;
               case 31:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(31);
                  break;
               case 44:
                  if (curChar != 124)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjCheckNAdd(45);
                  break;
               case 45:
                  if (kind > 44)
                     kind = 44;
                  jjCheckNAdd(45);
                  break;
               case 48:
                  if (kind > 45)
                     kind = 45;
                  jjstateSet[jjnewStateCnt++] = 48;
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
               case 21:
               case 22:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 26:
               case 27:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddStates(5, 7);
                  break;
               case 45:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 48:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjstateSet[jjnewStateCnt++] = 48;
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
      if ((i = jjnewStateCnt) == (startsAt = 49 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 35:
         return jjMoveStringLiteralDfa1_1(0x800000000000L);
      case 93:
         return jjMoveStringLiteralDfa1_1(0x2000000000000L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 35:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStopAtPos(1, 49);
         break;
      case 91:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStopAtPos(1, 47);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   37, 38, 39, 46, 47, 25, 27, 28, 20, 22, 23, 33, 34, 35, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\53\53", "\56", "\77", null, null, null, null, 
null, "\151\156\143\154\165\144\145", "\151\156", "\155\141\164\143\150", 
"\100\145\170\145\143", "\100\160\162\151\156\164", "\100\151\156\160\165\164", 
"\100\151\156\160\165\164\142\157\170", "\50", "\51", "\133", "\135", "\54", null, "\40\173\174", "\174\175", "\75", 
"\73", "\173", "\175", "\156\165\155", "\154\151\163\164", "\163\145\164", 
"\146\165\156\143", "\142\157\157\154", "\163\164\162", "\72", null, "\55\76", "\174\76", "\174", 
"\55\76\76", null, null, null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "BlockComment",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, 
   -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xfffffffffffL, 
};
static final long[] jjtoSkip = {
   0x3ef00000000000L, 
};
static final long[] jjtoSpecial = {
   0x100000000000L, 
};
static final long[] jjtoMore = {
   0x1000000000000L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[49];
private final int[] jjstateSet = new int[98];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public ForteLangTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ForteLangTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 49; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
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

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
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
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 13 && (0x2600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 48)
         {
            jjmatchedKind = 48;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        jjimageLen += jjmatchedPos + 1;
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
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
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 47 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                   ForteLang.innerComments++;
         break;
      case 49 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                if(ForteLang.innerComments == 0) {
                    SwitchTo(DEFAULT);
                } else {
                ForteLang.innerComments--;
                }
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
