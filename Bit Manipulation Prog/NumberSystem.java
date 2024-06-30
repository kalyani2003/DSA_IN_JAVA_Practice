/* Introduction to Bit Manipulation.
  
 * In Bit Manupulation we have to deal with 2 Number system
 * 1) ----> Binary Number System (0, 1)
 * 2) ----> Decimal Number System (1 to 9)
 * ----------------------------------------------------------------------------

 * Conversion of Binary to Decimal ---->
 *   1) "0011"--->> convert it into Decimal Number
 * 
 *    ///Steps for Conversion ///
 * (i)-- indexing the above no as -->> 0,1,2,3 from <Right to left>
 * (ii)-- then multply it with the values with 2 raised to the index. 
 *         and  add it same for the next values too.
 * (iii)-- Example --->> "0011"
 *                  =  1*2^0 + 1*2^1 + 0*2^2 + 0*2^3
 *                  =   1 + 2 + 0 + 0
 *                  =    3 
 *     so "0011" in decimal is == 3
 *  --------------------------------------------------------------------------
 
 *       Conversion of Decimal to Binary ---->  
 *         1) "12"--->> convert it into the binary Number
 * 
 *      /// Steps for Conversion ///
 *      (i)-- Divide the number by 2 untill the last.
 *      (ii)-- Store the all remainders and last value too.
 *      (iii)-- Count the remainders from bottom to top.
 *      (iv)-- Example --->> "12"
 *                         = 12/2= Reaminder 0
 *                         = 6/2 = Remainder 0
 *                         = 3/2 = Remainder 1
 *                         = Last Value = 1
 *     so in decimal "12" is =====>> 1100  
 * ----------------------------------------------------------------------------
 * */