# Clojure for All

A curated path toward Clojure proficiency.


## Welcome!

Above all, this guide aims to be a friendly and welcoming place for people of all skill levels to interact around the subject of computer programming.

Are you a person? Are you still breathing?

Check. And check. That's it. You're in!

## Goal & Audience

Our goal is to help you learn to program reliable solutions to real world problems that you're interested in solving. We want to introduce you to powerful technology that might otherwise have escaped your attention. We want to show you a `better way` of doing things.

To reach our goal, we will be directing you toward, free and paid, external online resources that best match your learning style and situation. This tutorial also contains original content to get your started and fill in the gaps between existing learning resources.

This guide assumes you are willing to look up words on your own when you encounter unfamiliar terminology. We recommend the following online dictionary over Wikipedia because the definitions are more digestible due to their conciseness: http://foldoc.org

It is a great challenge to write material which is both engaging to experienced programmers and comprehensible to new students. When the tension between these forces becomes too great, we will err on the side of being accessible to newcomers. That being said, I offer this word of advice to newcomers:

> Let the information wash over your brain the first time through, during which time the new, unfamiliar ideas and symbols will seem highly foreign and strange. This is normal. The second time through, the off-putting novelty will fade and a deeper learning experience will emerge. By your third time revisiting a topic, you will be able to engage with the ideas more directly, with their essence and therefore glean the lion's share of potential learning reward. Perseverance wins in the end. We will do everything we can to grease the track as you go along.

### About the Author; & Do I need math skills?

My name is Jay Martin. My goal in writing this tutorial is to help others avoid the mistakes I made when first setting about to learn programming. I hope to reach the people who think that Clojure and functional programming is exclusively for `the really smart programmers` etc. Nonsense! Clojure is for those willing to put in the work to learn it.

Learning is a topic I'm keenly interested in. After all, it affects every part of our lives. In my talk, [The Value of Learning](https://youtu.be/aEh5VAfp79A), I lay out two contrasting modes of learning, outside-in versus inside-out. These can be summarized informally by saying: either the crux of the responsibility and action of learning lies in the external environment of the student, i.e. with the University itself, or rather it lies within the individual student. Another way to think of it is whether or not the learning is being imparted to the student or whether the student is the one who is actively assimilating the learning experience.

I believe we can improve both sides of this learning equation by taking a balanced approach. There's a time and place for both modes and we must experiment with the ratio, means and methods among these approaches to find the most effective way to help learners succeed in their learning goals. One area I'd like to focus on throughout this resource is that of reading code. I intend to expose newcomers to the code reading patterns of professional coders. I'm very excited about this idea and believe it has the potential to open us new areas of collaboration and connection between veterans and new recruits.

If you are willing to try to learn, there is reward enough in the trying to justify your efforts here. It is my experience that anyone can significantly improve their own capacity for learning through the practice and effort of trying. Math is an unforgiving subject. Most of us, myself included get so busy in school that we fail to correct our understanding for that 10% of the material we missed on the exam. The following year, in Algebra II, that 10% becomes 20%, and so on, until the weight of our previous misunderstandings prevent us from even trying. That's normal. We told ourselves we preferred other subjects to math anyway. We shrugged it off by saying "I'm just not a math person".

It's never too late to become a math person! Just ask Dr. Barbara Oakley of [Learning How to Learn](https://www.coursera.org/learn/learning-how-to-learn) internet fame. She became technical by _**trying**_.

I'm 47 this year. Over these path three years, studying programming has re-invigorated my intellect and I'm happier than ever thanks to the mental challenge, regular exercise, good sleep routine, and a strong sense of purpose. I want to build things to improve the daily lives of people.

To bolster my confidence in Math and fill in any gaps, I researched at-home math curriculum and purchased [the best Algebra course I could find](http://www.teachingtextbooks.com/). Of course, [Khan Academy](https://www.khanacademy.org/) is another high-quality freely available resource. It's true that many people claim [you don't have to be good at math to learn to code](https://www.theatlantic.com/technology/archive/2015/09/you-dont-have-to-be-good-at-math-to-learn-to-code/403342/), but I also think its good to start practicing a little math every week, because it's such a great way to warm up our problem solving acumen. It also helps when you want to read up on the theories and algorithms that underlie our programming languages and tools. This is completely optional but you just might find that a "take the bull by the horns " approach is motivating for you. If not, skip the math for now and pick it if and when the time feels right in your learning journey.

### Authorship voice

>By helping others who are just getting started with Clojure, it is my hope that more experienced Clojure developers will get involved in authoring this Open Source tutorial to strengthen the overall quality of information and method of delivery herein. For this reason, I use "We" and "Our" when offering general advice and direction, reserving "I" or "Me" for sharing direct personal experience about myself. If contributors wish to share such direct experiences, please include your name or internet handle in parentheses next to your use of "I" or "Me".


## What is Clojure?

Clojure's official [website](https://clojure.org/) provides this concise answer:

> Clojure is a robust, practical, and fast programming language with a set of useful features that together form a simple, coherent, and powerful tool.

I think of Clojure as _**a way of building software**_ that is uniquely facilitated by Clojure's novel design. Clojure is the brainchild of Rich Hickey, who dedicated years of thoughtful design to bring a trifecta of harmonious programming artifacts into the world. These are Clojure, [ClojureScript](https://clojurescript.org/), and [Datomic](http://www.datomic.com/).

Clojure runs on top of the Java Virtual Machine (JVM), itself an industrial grade computing platform.

ClojureScript brings Clojure's strengths to web development, and anywhere else that JavaScript runs.

The Datomic database allows database queries to be written by a wider swath of the population because these queries are structured the way people think, not around the needs of the computer. Not many programming languages can claim to share design continuity with any database, much less one of Datomic's caliber.

Clojure is declarative in nature. Ideally, well-written clojure is like having a conversation about what we need from the computer, generally some form of information processing. Let me qualify that statement by being candid with you. In order for you to be a proficient conversationalist in clojure will likely take two years of practice, several days per week. The effort is justified in the additional power and capability you will have as a Clojure programmer above and beyond what you could do in another language in twice that amount of time or more, if ever.


### Clojure is a Lisp

Clojure is a dialect of Lisp, which is short for "list processor". This is Clojure's great superpower, but also the reason behind its inherent learning curve. Fear not! This tutorial, and another a free [online course](https://www.edx.org/course/how-code-simple-data-ubcx-htc1x) we will direct you toward if needed, are designed to take the sting out of learning Lisp.

Lisp code, Clojure included, is itself a highly consistent and uniform data structure. This makes it possible for mere mortals, like me, to generate and manipulate code programmatically. This is called meta-programming and is the realm of elite programmers in other languages such as Python, Ruby, Java etc. In contrast to these languages, Clojure is *inherently* a programmable programming language, allowing you and your team the power to extend Clojure to suit your needs.

You will often hear Clojure developers using phrases such as `code as data` or `data as code`. This is a Lisp thing and it will likely take months or longer to sink in fully. With time and practice it will make much more sense. You need to have your own natural aha! Moment and you will never see programming the same again.

The net effect? Clojure democratizes access to powerful programming techniques, thus tearing down that wall between you and your potential creativity.


### Clojure is *data-centric*

Rich Hickey, in his seminal talk *[Simple Made Easy](https://www.infoq.com/presentations/simple-made-easy)*, observes that reliable modern software systems communicate with each other by sending and receiving data. Ironically, many programming languages and paradigms, such as Java and certain flavors of object orientation, attempt to bury data deep within the myriad building blocks of their programs. In contrast, Clojure liberates data. It elevates data front-and-center, thus increasing the reliability of systems written in Clojure.

Data is used to *represent* information from our human world inside the digital realm. We then *interpret* that data as information to make observations, decisions, or to guide further interaction with the machine world. This talk of data and information may seem confusing at first. After all, what's the difference? A concrete example might help.

As you observe the world through your human eye, a massive amount of *information* regarding color is received by the brain through the input channel of your optic nerve. That amount of information is too vast for the average computer to process efficiently so computer programmers devised a way to represent color using a simple three letter system, [rgb](https://foldoc.org/rgb). Each letter can be set to a value between 0 and 255. In this way, the computer uses data such as ```0 0 255``` to closely approximate, or _represent_, the color as it appears in the world, in this case blue. When the computer encounters rgb data, it is programmed  to *interpret* such data as color (information) so that it may display color on the screen.

Humans have been milking things down to their essence way before computers ever existed. The notches on the [lebombo bone](https://en.wikipedia.org/wiki/lebombo_bone) were likely used to represent days, while the bone in its entirety was likely used to represent a lunar cycle. Time is a very abstract thing, but the moon passing by is less abstract. Notches on a bone are a concrete, unchanging representation of one of natures most mysterious aspects, time.

In the same way that notches on a bone help to model time in an understandable way, data is a powerful tool for modeling abstract things in a more tangible, more real, more understandable way. Data in the realm of the computer is the closest thing we have to a pure truth. If I give you the data ```0 0 255```, then you have the data as it is. Does that mean I've given your the color blue? No. It's just three numbers. That's all it is. I might hint at my intentions as the sender of this data by sending you three letters and three numbers, in the form of ```rgb 0 0 255```. Even still, we just have three letters and three numbers. It's possible that rgb means something different to me or you. We could still choose to interpret that data in any way we choose.

This brings us to the topic of self-describing data. Wouldn't it be nice for data to exist with its own meaning embedded within itself, eliminating ambiguity and fulfilling its potential as pure truth within our software systems? Clojure data, and even the **code** you write in Clojure, is based on a data format called extensible data notation which allows you to send self-describing data over the wire or between software processes. This is in stark contrast to widespread industry standard data formats, such as [JSON](https://foldoc.org/json).

### Clojure excels at data manipulation

Transforming data from one shape and form to another is the primary task of a programmer. Think about it for a moment. Once the electrical engineers convert electricity from a wall socket or a battery into the famous zero and ones that underlie all modern computation, everything that happens in the computer must be built on top of those elementary building blocks.

There are many layers of building blocks, stacked one on top of the other, all the way down to zeros and ones. These layers of abstraction allow [higher level languages](http://www.nand2tetris.org/lectures/pdf/lecture%2009%20high%20level%20language.pdf), like Clojure, to faciliate higher-level thinking in the mind of the programmer.

We are not dealing with zeros and ones, but rather data is helpful to problems we have at hand.

Clojure provides and a small handful of data types in which to store data that represents information which is meaningful to you. These data types look familiar to those other popular languages, such as JavaScript.

For example, Clojure has an array-like data structure called a ```vector``` to store ordered data:

```[8 13 3 0 34 89]```

Clojure also has an associative data structure, similar to a javascript object or python dictionary, called a Clojure map, or ```hashmap``` to be precise:

```
{:a 1
 :b 2
 :c 3}
 ```
    
While these look familiar to data structures found elsewhere, Clojure's data structures contain a hidden strength. They are immutable. Pause and let that sink in. In Clojure, data never changes. What!?! I know this is weird. Its also incredibly powerful.

We are entering the territory of functional programming, Clojure's wheelhouse. Clojure has hundreds of functions (a named operation), dozens of which you will use regularly, which take immutable data as input and return a new piece of immutable data as output.

This simple mental model: `old data in, new data out`, describes the fundamental building blocks and way of solving problems in Clojure. A chain of one or more functions are chosen based on the need to produce result data from input data, until the final result assumes a shape which accurately satisfies the problem at hand. Functions in Clojure compose elegantly, allowing a rich `dialogue of intent` between the programmer and Clojure. 

We will dig much more deeply into the topic of immutable data early on in this tutorial, but for now the important thing to know is that Clojure achieves this technical feat using some smart data-sharing algorithms under the hood and that immutable data eradicates a wide array of common programming pitfalls. It makes programs easier to reason about and illuminates the otherwise hidden interactions between the runtime components of a program. It's hard to over-hype the positive effect this will have on your programming career and the success of your projects. It's the fountain source of joy which Clojure programmers are renowned to experience upon mastering the Clojure way of doing things.

### Clojure is a vision

Clojure is a bit of a paradox. On one hand, it's rock solid in the core functionality it provides. On the other, Clojure continues to innovate new language features and delight its users with novel, immensely powerful functionality. Most notably, [Clojure Spec](https://clojure.org/about/spec) was recently introduced which provides an à la carte data specification system that brings the power of static types but with much greater agility for the programmer.

Clojure isn't shy about borrowing what works. Communicating Sequential Processes (CSP) have been popularized by Google's Go language. Clojure adopted this paradigm via its core.async *library* (a named set of functions). Clojurians have been quick to pick up CSP, but have learned that (in general) its best used at the edge of a system, not at the heart of one. I mention this because I've learned so much more than I ever thought possible because of the brilliant minds in Clojure who freely share their hard earned programming wisdom. 

These professionals aren't doing things the hard way. They are going with the grain of the wood and solving problems in the most natural possible way. It isn't a perfect way. There's are still a few things which can be improved but the work is well underway. The progress early Clojurians have made since its inception in 2007 is staggering! We are truly standing on the shoulder of giants.

To me, Clojure represents a vision of a better way of doing things.

### Clojure is a community

It's also important to note that Clojure is a group effort. There is a vibrant and flourishing [community](https://clojure.org/community/success_stories) of highly competent people eager to help you succeed in your programming goals. Clojure and ClojureScript are Open Source and freely available for you to use to create robust software solutions.

Clojure is a fast growing group of people who work diligently to continuously improve the state-of-the-art in software development.

Clojure has many groups, Slack Channels, IRC channels, and forum's, including one I created: http://discuss.thevalueoflearning.org/

You will be readily welcomed anywhere you happen to plug into the community online or at an in-person event, such a [user group meeting](https://dev.clojure.org/display/community/Clojure+User+Groups).

## Why learn Clojure?

I can't answer this question for you. That would be too presumptive of me. But I can tell you why I chose Clojure.

In a nutshell, Clojure ticks two major boxes for me.

First and foremost, Clojure is highly practical. Rick Hickey has focused the language strongly around creating business value. There's a recent [success story](https://youtu.be/3y7xzH8jB8A) about an Indonesian company that has experienced a 500% increase in their feature release productivity after switching from Go to Clojure. I love stories like these! I intend to use Clojure pervasively in my businesses. Clojure is general enough that I could pivot my business in practically any direction and still use Clojure to build on. 

Secondly, Clojure opens up a world of learning and exploration above and beyond what I experienced in other languages. Perhaps this has a lot to do with where I was in my learning journey at the time, but I'm convinced that there really is something uniquely special about the ideas I'm being exposed to in this community. 

As a life-long learner my insatiable curiosity will be occupied for years to come. Paradoxically, [Clojure is boring](https://8thlight.com/blog/colin-jones/2016/10/06/clojure-is-boring.html), and that's a good thing!

### A technical reason

There's also one significant technical reason I chose Clojure that has to do with databases. Most applications deal with nested data structures or object hierarchies. Object Relational Management layers are used to solve the N+1 problem and stuff nested data into tabular relational databases. I have first hand experience with an expertly built application which required significant alteration of the data model itself to accommodate the needs of the database.

I [wrote more](http://discuss.purelyfunctional.tv/t/jay-martin-clojure-remote-2017-interview/925) about this reason in an online email interview with well-known Clojure educator, Eric Normand of [PurelyFunctional.tv](http://purelyfunctional.tv), which I refer you to if you'd like to dig deeper on the topic.

### Other reasons

There are other lesser reasons, which I will add below as they come to me.

Clojure is web scale out of the box. Clojure has powerful concurrency primitives built-in to the heart of the language. It is unconstrained by a Global Interpreter Lock (GIL), like Ruby and Python are. This isn't a big deal for most new companies, but if you are lucky enough to experience overnight success, perhaps you get selected to go the Oprah show, then you'll be glad you picked Clojure. Most of these web scale issues have to do with architectural issues in addition to language features. A web search for `twitter scaling issues with ruby on rails` will list articles which collectively should tell both sides of the story pretty well. Oh, the problems we should have, right!?!

(To be continued soon...)


## Our online site

The URL for this guide is: TBD.


## Other Clojure quick start resources

https://clojure.org/guides/getting_started

http://www.clojurenewbieguide.com/

http://www.unexpected-vortices.com/clojure/brief-beginners-guide/general-overview.html

http://www.learn-clojure.com/clojure_tutorials.html

http://howistart.org/posts/clojure/1/index.html

## Clojure Tutorials

http://writingcoding.blogspot.com/2008/07/stemming-part-8-macros.html

https://objectcomputing.com/resources/publications/sett/march-2009-clojure-functional-programming-for-the-jvm/

