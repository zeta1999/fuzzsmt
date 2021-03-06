/*  FuzzSMT: Fuzzing tool for Satisfiablity Modulo Theories (SMT) benchmarks.
 *  Copyright (C) 2009  Robert Daniel Brummayer
 *
 *  This file is part of FuzzSMT.
 *
 *  FuzzSMT is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  FuzzSMT is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

public class ArrayTypeFromTo extends SMTType {

		SMTType from, to;
	
  public ArrayTypeFromTo (SMTType from, SMTType to) 
  {
	  this.from = from;
	  this.to = to;
	  
  }

  public String toString(boolean smtlib1) {
	  if (smtlib1)
		  return "Array";
	  else
		  return "(Array " + from.toString(smtlib1) + " " + to.toString(smtlib1) +")";
  }

}
