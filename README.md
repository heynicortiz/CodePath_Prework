# Android Prework - *Hello World from Nic*

Submitted by: Nicolas Ortiz

**Hello World from Nic** is an android app that shows an image and introductory message, and allows pressing a button to display a Toast. 

Time spent: **7** hours spent in total

## Required Features

The following **required** functionality is completed:

* [X] Image and introductory message displayed on screen
* [X] Button displayed on screen
* [X] Toast with message appears when button is pressed 

The following **optional** features are implemented:

* [ ] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list

The following **additional** features are implemented:

* [X] Customized toast to appear in the middle of the display. This keeps it from covering the "Say Hello" button placed at the bottom of the screen.
* [X] Centered toast text. Multi-line toasts do not show centered text by default, this keeps the presentation cleaner.
* [X] Change toast text based on number of button clicks thus far. Ranges are 0, 1-5, and 5+.
* [X] Change main image when button click count reaches beyond 5. This is just a bit of an Easter egg to become more familiar with using resources in Kotlin.
* [X] Custom font used for header text and "Say Hello" button
* [X] Imported Material Design icon to use for "Say Hello" button
* [X] Updated app icon to match hero image


## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://i.imgur.com/PFJF1ac.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

As I was working on this project, I decided to try a multi-line toast. This brought the challenge of no longer being centered and also covering the "Say Hello" button towards the bottom. I did some searching and found some tutorial videos that went over ideas to modify toasts. I was able to implement some of these and also found out that some were deprecated. Ultimately, I implemented a Spannable String but found those to be immutable so I reworked the way I was implementing the changing strings as I incremented my button click counter.

Another challenge was properly changing the "hero" image. I was not quite sure on how to do this, but found I could follow a similar process as the Prework video series showed for bringing the button into the MainActivity.kt file.

## License

    Copyright [2022] [Nicolas Ortiz]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
