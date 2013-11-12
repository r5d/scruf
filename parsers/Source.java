/*+
 *   Copyright 2012, 2013 rsiddharth <rsiddharth@ninthfloor.org>
 * 
 *   This file is part of Scruf.
 *
 *   Scruf is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


package scruf.parsers;

import scruf.status.*;

public class Source implements Parser {
	private StringBuilder sbuilder;
	public String parse(String fileContent) {
		sbuilder = new StringBuilder(fileContent);
		// append a link to the source.
		sbuilder.append("\n <div class=\"source\">\n");
		sbuilder.append("\n <a href=\"./"+PresentFile.file.getName()+
						"\">source</a>\n </div>");
		return sbuilder.toString();
	}
}
