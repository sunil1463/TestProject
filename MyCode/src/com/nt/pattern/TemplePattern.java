/*************************************************************************************************
                           Print This pattern
 						
                                   *
                                 * * *
                               * * * * *
                             * * * * * * *
                             * * * * * * *
                             * * * * * * *
                             * *       * *
                             * *       * *
                             * *       * * 
 
 ************************************************************************************************/
package com.nt.pattern;
public class TemplePattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i <= 3) {
					if (j >= 5 - i && j <= 3 + i) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				} 
				else if (i >= 4 && i <= 6) {
					if (j >= 1 && j <= 7) {
						System.out.print("* ");
					}
				} 
				else if (i >= 7 && i <= 9) {
					if (j <= 2 || j >= 6) {
						System.out.print("* ");
					} 
					else {
						System.out.print("  ");
					}
				}
			}
			System.out.println("  ");
		}
	}
}