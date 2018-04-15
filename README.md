# Copy-button
### Copy Textview text with one simple click

## **Usage** ##
![image](https://image.ibb.co/dfdi4c/ezgif_com_video_to_gif_2.gif)

[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-Copy%20button-green.svg?style=flat )]( https://android-arsenal.com/details/1/6914 )


**Gradle**

    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

    dependencies {
         compile 'com.github.hajiyevelnur92:Copy-button:1.0'
    }



#### **Code**
```java

import codehive.copybuttonlibrary.CopyButtonLibrary;
...

CopyButtonLibrary copyButtonLibrary = new CopyButtonLibrary(getApplicationContext(),textView);
copyButtonLibrary.init();


```

### [License](./LICENSE)
