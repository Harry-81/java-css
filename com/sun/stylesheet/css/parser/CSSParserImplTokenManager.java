/* Generated By:JJTree&JavaCC: Do not edit this line. CSSParserImplTokenManager.java */
package com.sun.stylesheet.css.parser;

public class CSSParserImplTokenManager implements CSSParserImplConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x200000000000L) != 0L)
            return 22;
         if ((active0 & 0x1e3f8000700L) != 0L)
         {
            jjmatchedKind = 41;
            return 31;
         }
         if ((active0 & 0x8L) != 0L)
            return 1;
         if ((active0 & 0x1000L) != 0L)
            return 7;
         return -1;
      case 1:
         if ((active0 & 0x80000000L) != 0L)
            return 31;
         if ((active0 & 0x1e378000700L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
            return 31;
         }
         return -1;
      case 2:
         if ((active0 & 0x100L) != 0L)
            return 31;
         if ((active0 & 0x1e378000600L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 2;
            return 31;
         }
         return -1;
      case 3:
         if ((active0 & 0x1e378000200L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 3;
            return 31;
         }
         if ((active0 & 0x400L) != 0L)
            return 31;
         return -1;
      case 4:
         if ((active0 & 0x60000000L) != 0L)
            return 31;
         if ((active0 & 0x1e318000200L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 4;
            return 31;
         }
         return -1;
      case 5:
         if ((active0 & 0x118000000L) != 0L)
            return 31;
         if ((active0 & 0x1e200000200L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 5;
            return 31;
         }
         return -1;
      case 6:
         if ((active0 & 0x8000000200L) != 0L)
         {
            if (jjmatchedPos != 6)
            {
               jjmatchedKind = 41;
               jjmatchedPos = 6;
            }
            return 31;
         }
         if ((active0 & 0x16200000000L) != 0L)
            return 31;
         return -1;
      case 7:
         if ((active0 & 0x8000000000L) != 0L)
            return 31;
         if ((active0 & 0x10000000200L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 7;
            return 31;
         }
         return -1;
      case 8:
         if ((active0 & 0x200L) != 0L)
            return 31;
         if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 8;
            return 31;
         }
         return -1;
      case 9:
         if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 9;
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
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 24);
      case 35:
         return jjStartNfaWithStates_0(0, 45, 22);
      case 37:
         return jjStopAtPos(0, 20);
      case 40:
         return jjStopAtPos(0, 25);
      case 41:
         return jjStopAtPos(0, 26);
      case 42:
         return jjStopAtPos(0, 44);
      case 43:
         return jjStopAtPos(0, 15);
      case 44:
         return jjStopAtPos(0, 19);
      case 46:
         return jjStopAtPos(0, 18);
      case 47:
         return jjMoveStringLiteralDfa1_0(0x8L);
      case 58:
         return jjStartNfaWithStates_0(0, 12, 7);
      case 59:
         return jjStopAtPos(0, 13);
      case 62:
         return jjStopAtPos(0, 14);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x1c000000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x310000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 123:
         return jjStopAtPos(0, 16);
      case 125:
         return jjStopAtPos(0, 17);
      default :
         return jjMoveNfa_0(6, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x8L) != 0L)
            return jjStopAtPos(1, 3);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x1c010000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x2300000100L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 111:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(1, 31, 31);
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L);
      case 118:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
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
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x2200000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000200L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x1c000000000L);
      case 119:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(2, 8, 31);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
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
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x1c108000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000L);
      case 114:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(3, 10, 31);
         break;
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
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
      case 45:
         return jjMoveStringLiteralDfa5_0(active0, 0x1c000000000L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x118000000L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 115:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(4, 29, 31);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(4, 30, 31);
         break;
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
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
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x14000000000L);
      case 108:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(5, 28, 31);
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000000L);
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000L);
      case 114:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(5, 27, 31);
         break;
      case 116:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(5, 32, 31);
         return jjMoveStringLiteralDfa6_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private final int jjMoveStringLiteralDfa6_0(long old0, long active0)
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
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x200L);
      case 110:
         if ((active0 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 6;
         }
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000000L);
      case 116:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(6, 33, 31);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 37, 31);
         break;
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private final int jjMoveStringLiteralDfa7_0(long old0, long active0)
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
      case 45:
         return jjMoveStringLiteralDfa8_0(active0, 0x10000000000L);
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x200L);
      case 116:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 39, 31);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private final int jjMoveStringLiteralDfa8_0(long old0, long active0)
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
      case 111:
         return jjMoveStringLiteralDfa9_0(active0, 0x10000000000L);
      case 116:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(8, 9, 31);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private final int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 117:
         return jjMoveStringLiteralDfa10_0(active0, 0x10000000000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private final int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(10, 40, 31);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 59;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 6)
                        kind = 6;
                     jjCheckNAddStates(0, 15);
                  }
                  else if ((0x100002600L & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                     jjCheckNAdd(0);
                  }
                  else if (curChar == 45)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(31);
                  }
                  else if (curChar == 35)
                     jjstateSet[jjnewStateCnt++] = 22;
                  else if (curChar == 39)
                     jjCheckNAddStates(16, 18);
                  else if (curChar == 34)
                     jjCheckNAddStates(19, 21);
                  else if (curChar == 58)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 0:
                  if ((0x100002600L & l) == 0L)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjCheckNAdd(0);
                  break;
               case 1:
                  if (curChar == 47)
                     jjCheckNAddStates(22, 24);
                  break;
               case 2:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(22, 24);
                  break;
               case 3:
                  if ((0x2400L & l) != 0L && kind > 2)
                     kind = 2;
                  break;
               case 4:
                  if (curChar == 10 && kind > 2)
                     kind = 2;
                  break;
               case 5:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 8:
                  jjAddStates(25, 26);
                  break;
               case 10:
                  if (curChar == 58)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 11:
                  if (curChar == 34)
                     jjCheckNAddStates(19, 21);
                  break;
               case 12:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(19, 21);
                  break;
               case 14:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(19, 21);
                  break;
               case 15:
                  if (curChar == 34 && kind > 21)
                     kind = 21;
                  break;
               case 16:
                  if (curChar == 39)
                     jjCheckNAddStates(16, 18);
                  break;
               case 17:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 19:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 20:
                  if (curChar == 39 && kind > 21)
                     kind = 21;
                  break;
               case 21:
                  if (curChar == 35)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 25:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 28:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) != 0L && kind > 22)
                     kind = 22;
                  break;
               case 30:
                  if (curChar != 45)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(31);
                  break;
               case 31:
                  if ((0x3ff200000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(31);
                  break;
               case 32:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAddStates(0, 15);
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAddTwoStates(33, 34);
                  break;
               case 34:
                  if (curChar == 46)
                     jjCheckNAdd(35);
                  break;
               case 35:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAdd(35);
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(27, 29);
                  break;
               case 37:
                  if (curChar == 46)
                     jjCheckNAdd(38);
                  break;
               case 38:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(38, 39);
                  break;
               case 39:
                  if (curChar == 37 && kind > 34)
                     kind = 34;
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(30, 36);
                  break;
               case 41:
                  if (curChar == 46)
                     jjCheckNAdd(42);
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(37, 42);
                  break;
               case 53:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(43, 46);
                  break;
               case 54:
                  if (curChar == 46)
                     jjCheckNAdd(55);
                  break;
               case 55:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(47, 49);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 6:
               case 31:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(31);
                  break;
               case 2:
                  jjAddStates(22, 24);
                  break;
               case 7:
                  if (curChar == 123)
                     jjCheckNAdd(8);
                  break;
               case 8:
                  if ((0xdfffffffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(8, 9);
                  break;
               case 9:
                  if (curChar == 125 && kind > 11)
                     kind = 11;
                  break;
               case 12:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(19, 21);
                  break;
               case 13:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 14:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(19, 21);
                  break;
               case 17:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 18:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 19:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 22:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 23:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 24:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 25:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 26:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 27:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 28:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 29:
                  if ((0x7e0000007eL & l) != 0L && kind > 22)
                     kind = 22;
                  break;
               case 43:
                  if (curChar == 109 && kind > 35)
                     kind = 35;
                  break;
               case 44:
                  if (curChar == 109)
                     jjCheckNAdd(43);
                  break;
               case 45:
                  if (curChar == 99)
                     jjCheckNAdd(43);
                  break;
               case 46:
                  if (curChar == 110 && kind > 35)
                     kind = 35;
                  break;
               case 47:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if (curChar == 112)
                     jjCheckNAddStates(50, 52);
                  break;
               case 49:
                  if (curChar == 116 && kind > 35)
                     kind = 35;
                  break;
               case 50:
                  if (curChar == 120 && kind > 35)
                     kind = 35;
                  break;
               case 51:
                  if (curChar == 99 && kind > 35)
                     kind = 35;
                  break;
               case 52:
                  if (curChar == 101)
                     jjCheckNAddTwoStates(43, 50);
                  break;
               case 56:
                  if (curChar == 115 && kind > 36)
                     kind = 36;
                  break;
               case 57:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 56;
                  break;
               case 58:
                  if ((0x8200000000000L & l) != 0L && kind > 36)
                     kind = 36;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(22, 24);
                  break;
               case 8:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(25, 26);
                  break;
               case 12:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(19, 21);
                  break;
               case 17:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(16, 18);
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
      if ((i = jjnewStateCnt) == (startsAt = 59 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x10L);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x10L) != 0L)
            return jjStopAtPos(1, 4);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   33, 34, 36, 37, 39, 40, 41, 44, 45, 47, 53, 54, 57, 58, 48, 52, 
   17, 18, 20, 12, 13, 15, 2, 3, 5, 8, 9, 36, 37, 39, 40, 41, 
   44, 45, 47, 48, 52, 42, 44, 45, 47, 48, 52, 53, 54, 57, 58, 55, 
   57, 58, 49, 50, 51, 
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, "\156\145\167", 
"\151\155\160\157\162\164\141\156\164", "\157\166\145\162", null, "\72", "\73", "\76", "\53", "\173", "\175", "\56", 
"\54", "\45", null, null, null, "\41", "\50", "\51", "\154\151\156\145\141\162", 
"\162\141\144\151\141\154", "\146\157\143\165\163", "\163\164\157\160\163", "\164\157", 
"\162\145\160\145\141\164", "\162\145\146\154\145\143\164", null, null, null, 
"\144\145\146\141\165\154\164", "\145\141\163\145\55\151\156", "\145\141\163\145\55\157\165\164", 
"\145\141\163\145\55\151\156\55\157\165\164", null, null, null, "\52", "\43", };
public static final String[] lexStateNames = {
   "DEFAULT", 
   "IN_COMMENT", 
};
public static final int[] jjnewLexState = {
   -1, -1, -1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x33ffff7fff43L, 
};
static final long[] jjtoSkip = {
   0x1cL, 
};
static final long[] jjtoMore = {
   0x20L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[59];
private final int[] jjstateSet = new int[118];
protected char curChar;
public CSSParserImplTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public CSSParserImplTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 59; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  int kind;
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
      return matchedToken;
   }

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 5)
         {
            jjmatchedKind = 5;
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
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
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

}