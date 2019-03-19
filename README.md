# Petals Studio

[![Build Status](https://travis-ci.org/petalslink/petals-studio.svg?branch=master)](https://travis-ci.org/petalslink/petals-studio)
[![License](https://img.shields.io/badge/license-EPL%201.0-blue.svg)](https://www.eclipse.org/legal/epl-v10.html)
[![Web site](https://img.shields.io/badge/website-petals.linagora.com-772e87.svg)](http://petals.linagora.com)
[![Wiki](https://img.shields.io/badge/wiki-User%20Guide-e36111.svg)](https://doc.petalslink.com/display/petalsstudio/Petals+Studio)

Petals Studio is an Eclipse distribution dedicated to Petals ESB.

<a href="web/welcome.jpg?raw=true"><img src="web/welcome.jpg?raw=true" alt="Petals Studio's welcome page" /></a>

Some of these tools come from the Eclipse Foundation, while some others were developed specifically for Petals ESB.
Petals Studio aims at providing all the required and available tools for Petals ESB.

The plug-ins that have been developed specifically for Petals Studio are licensed under the terms of the Eclipse Public License.
The Petals Studio itself is a Software distribution where each component is governed by the terms and conditions of its own license.
All the embedded components are open-source.

The complete documentation is available [here](https://doc.petalslink.com/display/petalsstudio/Petals+Studio).


## Screen captures

Petals Studio includes creation and export wizards...

<a href="web/wizards-1.png?raw=true"><img src="web/wizards-1.png?raw=true" alt="Creation wizard" width="280" /></a> &nbsp; <a href="web/wizards-2.png?raw=true"><img src="web/wizards-2.png?raw=true" alt="Creation wizard" width="280" /></a>

<a href="web/wizards-3.png?raw=true"><img src="web/wizards-3.png?raw=true" alt="Creation wizard" width="280" /></a>  &nbsp; <a href="web/wizards-4.png?raw=true"><img src="web/wizards-4.png?raw=true" alt="Creation wizard" width="280" /></a>

... as well as specialized editors.

<a href="web/edition-mix.jpg?raw=true"><img src="web/edition-mix.jpg" alt="The source and form editors" width="600" /></a>


## Development Tips

If you have m2e (Eclipse tooling for Maven), you may get errors related
to lifecycle mapping. Just install the [Tycho connectors for m2e](http://repo1.maven.org/maven2/.m2e/connectors/m2eclipse-tycho/0.8.0/N/LATEST/)
in your Eclipse. That should solve these errors.
