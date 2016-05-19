# Material Colors

**Bold, graphic, intentional.**

>Deliberate color choices, edge-to-edge imagery, large-scale typography, and intentional white space create a bold and graphic interface that immerse the user in the experience. -- Google

Of course, no Material Design is complete without Material Colors. This library offers rich and vibrant color palettes for Android and Java Apps. Usage is straightforward and both *hex* and *rgb* codes are available.

### Code Sample
Load a palette based on already defined themes. For example:
```java
MaterialTheme theme = MaterialTheme.get(Theme.SAHARA);
```
Retrieve the *BLUE* shade of this theme and set it to a View in your app:
```java
ColorCode materialBlue = theme.getColor(MaterialColor.BLUE);
view.getBackground().setColorFilter(
	Color.parseColor(materialBlue.hex),
	PorterDuff.Mode.SRC
);
```
Optionally, you can simply select the next shade of color in the current palette:

```java
ColorCode materialColor = theme.getNextColor();
```
Or, select the shade of color directly from color objects defined in **material.color** package:
```java
import net.usrlib.material.color.Blue;
// Select Blue 500 hex value: #2196F3
String hexValue = Blue._500.hex;
```

### Installation
#### Gradle
```java
compile 'net.usrlib:material-color:0.2'
```
#### Maven
```xml
<dependency>
  <groupId>net.usrlib</groupId>
  <artifactId>material-color</artifactId>
  <version>0.2</version>
  <type>pom</type>
</dependency>
```
#### Ivy
```xml
<dependency org='net.usrlib' name='material-color' rev='0.2'>
  <artifact name='$AID' ext='pom'></artifact>
</dependency>
```

### Version
0.2

### Tech
Color codes are based on the Material Design Color Chart from [HtmlColorCodes.com][HtmlColorCodes]
### License
[Apache 2.0] [Apache]

### Links

* [Material Color on Bintray][Bintray]
* [Material Color Github Repo][Git]
* [Material Color Github Website][Www]
* [Material Color Java Docs][JavaDocs]
* [Material Color Track Issues][Issues]

[Www]: <http://rgr-myrg.github.io/material-color-java>
[Bintray]: <https://bintray.com/rgr-myrg/maven/material-color-java/view>
[Apache]: <http://www.apache.org/licenses/LICENSE-2.0>
[Git]: <https://github.com/rgr-myrg/material-color-java>
[JavaDocs]: <http://rgr-myrg.github.io/material-color-java/javadoc>
[Issues]: <https://github.com/rgr-myrg/material-color-java/issues>
[HtmlColorCodes]: <http://htmlcolorcodes.com/color-chart/material-design-color-chart>
