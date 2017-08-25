# Learn Clojure

A curated path toward Clojure mastery.


## Welcome!

Above all, this tutorial aims to be a friendly and welcoming place for people of all skill levels to interact around the subject of computer programming.

Are you a person? Are you still breathing?

Check. And check. That's it. You're in!


## What is Clojure?

Clojure's official [website](https://clojure.org/) provides this concise answer:

> Clojure is a robust, practical, and fast programming language with a set of useful features that together form a simple, coherent, and powerful tool.

I think of Clojure as _**a way of building software**_ that is uniquely facilitated by Clojure's novel design. Clojure is the brainchild of Rich Hickey, who dedicated years of thoughtful design to bring a trifecta of harmonious programming artifacts into the world. These are Clojure, [ClojureScript](https://clojurescript.org/), and [Datomic](http://www.datomic.com/).

Clojure runs on top of the Java Virtual Machine (JVM), itself an industrial grade computing platform.

ClojureScript brings Clojure's strengths to web development, and anywhere else that JavaScript runs.

The Datomic database allows database queries to be written by a wider swath of the population because these queries are structured the way people think, not around the needs of the computer. not many programming languages can claim to share design continuity with any database, much less one of datomic's caliber.

clojure is declarative in nature. ideally, well-written clojure is like having a conversation about what we need from the computer, generally some form of information processing. let me qualify that statement by being candid with you. in order for you to be a masterful conversationalist in clojure will likely take two years of practice, several days per week.


### Clojure is a lisp

clojure is a dialect of lisp, which is short for "list processor". this is clojure's great superpower, but also the reason behind its inherent learning curve. fear not! this tutorial will direct you toward a free [online course](https://www.edx.org/course/how-code-simple-data-ubcx-htc1x) designed to take the sting out of learning lisp.

lisp code, clojure included, is itself a highly consistent and uniform data structure. this makes it possible for mere mortals, like me, to generate and manipulate code programmatically. this is called meta-programming and is the realm of elite programmers in other languages such as python, ruby, java etc. in contrast to these languages, clojure is *inherently* a programmable programming language, allowing you and your team the power to extend clojure to suit your needs.

you will often hear clojure developers using phrases such as `code as data` or `data as code`. this is a lisp thing and it will take months to sink in fully. with time and practice it make much more sense. you need to have your own natural aha! moment and you will never see programming the same again.

the net effect? clojure democratizes access to powerful programming techniques, thus tearing down that wall between you and your potential creativity.


### Clojure is *data-centric*

rich hickey, in his seminal talk *[simple made easy](https://www.infoq.com/presentations/simple-made-easy)*, observes that reliable modern software systems communicate with each other by sending and receiving data. ironically, many programming languages and paradigms, such as java and certain flavors of object orientation, attempt to bury data deep within the myriad building blocks of their programs. in contrast, clojure liberates data. it elevates data front-and-center, thus increasing the reliability of systems written in clojure.

data is used to *represent* information from our human world inside the digital realm. we then *interpret* that data as information to make observations, decisions, or to guide further interaction with the machine world. this talk of data and information may seem confusing at first. after all, what's the difference? a concrete example might help.

as you observe the world through your human eye, a massive amount of *information* regarding color is received by the brain through the input channel of your optic nerve. that amount of information is too vast for the average computer to process efficiently. so computer programmers devised a way to represent color using a simple three letter system, [rgb](https://foldoc.org/rgb). each letter can be set to a value between 0 and 255. in this way, the computer uses data such as ```0 0 255``` to closely approximate, or _represent_, the color as it appears in the world, in this case blue. when the computer encounters rgb data, it is programmed  to *interpret* such data as color (information) so that it may display color on the screen.

humans have been milking things down to their essence way before computers ever existed. the notches on the [lebombo bone](https://en.wikipedia.org/wiki/lebombo_bone) were likely used to represent days, while the bone in its entirety was likely used to represent a lunar cycle. time is a very abstract thing, but the moon passing by is less abstract. notches on a bone are a concrete, unchanging representation of one of natures most mysterious aspects, time.

in the same way that notches on a bone help to model time in an understandable way, data is a powerful tool for modeling abstract things in a more tangible, more real, more understandable way. data in the realm of the computer is the closest thing we have to a pure truth. if i give you the data ```0 0 255```, then you have the data as it is. does that mean i've given your the color blue? no. it's just three numbers. that's all it is. i might hint at my intentions as the sender of this data by sending you three letters and three numbers, in the form of ```rgb 0 0 255```. even still, we just have three letters and three numbers. it's possible that rgb means something different to me or you. we could still choose to interpret that data in any way we choose.

this brings us to the topic of self-describing data. wouldn't it be nice for data to exist with its own meaning embedded within itself, eliminating ambiguity and fulfilling its potential as pure truth within our software systems? clojure data, and even the **code** you write in clojure, is based on a data format called extensible data notation which allows you to send self-describing data over the wire or between software processes. this is in stark contrast to widespread industry standard data formats, such as [json](https://foldoc.org/json).

### clojure excels at data manipulation

transforming data from one shape and form to another is the primary task of a programmer. think about it. once the engineers convert electricity from a wall socket or a battery into the famous zero and ones that underlay all modern computation, everything that happens in the computer must be built on top of those elementary building blocks.

there are many layers of building blocks, stacked one on top of the other, all the way down to zeros and ones. these layers of abstraction allow [higher level languages](http://www.nand2tetris.org/lectures/pdf/lecture%2009%20high%20level%20language.pdf), like clojure, to faciliate higher-level thinking in the mind of the programmer.

we are not dealing with zeros and ones, but rather data is helpful to problems we have at hand.

clojure provides and a small handful of data types in which to store data that represents information which is meaningful to you. these data types look familiar to those other popular languages, such as javascript.

for example, clojure has an array-like data structure called a vector to store ordered data:

```[8 13 3 0 34 89]```

and it has an associative data structure, similar to a javascript object or python dictionary, called a clojure map or hashmap:

```
{:a 1
 :b 2
 :c 3}
 ```
    
while these look familiar to data structures found elsewhere, clojure's data structures contain a hidden strength. they are immutable. pause and let that sink in. in clojure, data never changes. what!?! i know this is weird. but its also incredibly powerful.

we are entering the territory of functional programming, clojure's wheelhouse. clojure has hundreds of functions (a named operation), dozens of which you will use regularly, which take immutable data as input and return a new piece of immutable data as output.

this simple mental model: `old data in, new data out`, describes the fundamental building blocks and way of solving problems in clojure. a chain of one or more functions are chosen based on the need to produce result data from input data, until the final result assumes a shape which accurately satisfies the problem at hand. functions in clojure compose elegantly, allowing a rich `dialogue of intent` between the programmer and clojure. 

we will dig much more deeply into the topic of immutable data early on in this tutorial, but for now the important thing to know is that clojure achieves this technical feat using some smart data-sharing algorithms under the hood and that immutable data eradicates a wide array of common programming pitfalls. it makes programs easier to reason about and illuminates the otherwise hidden interactions between the runtime components of a program. it's hard to over-hype the positive effect this will have on your programming career and the success of your projects. it's the root cause of joy which clojure programmers are renowned to experience upon mastering the clojure way of doing things.

### Clojure is a vision

Clojure is a bit of a paradox. On one hand, it's rock solid in the core functionality it provides. On the other, Clojure continues to innovate new language features and delight its users with novel, immensely powerful functionality. Most notably, Clojure Spec was recently introduced which provides an à la carte data specification system that brings the power of static types but with much greater agility.

Clojure isn't shy about borrowing what works. Communicating Sequential Processes have been popularized by Google's Go language. Clojure adopted this paradigm via its core.async library (a named set of functions). Clojurians have been quick to pick up CSP, but have learned that (in general) its best used at the edge of a system, not at the heart of one. I mention this because I've learned so much more than I ever thought possible because of the brilliant minds in Clojure who freely share their hard earned programming wisdom.

These professionals aren't doing things the hard way. They are going with the grain of the wood and solving problems in the most natural possible way. It isn't a perfect way. There's are still a few things which can be improved but the work is well underway. The progress early Clojurians have made since its inception in 2007 is staggering! We are truly standing on the shoulder of giants.

To me, Clojure represents a better way of doing things.

### Clojure is a community

It's also important to note that clojure is a group effort. There is a vibrant and flourishing [community](https://clojure.org/community/success_stories) of highly competent people eager to help you succeed in your programming goals. Clojure and ClojureScript are Open Source and freely available for you to use to create robust software solutions.

Clojure is a fast growing group of people who work diligently to continuously improve the state-of-the-art in software development.

Clojure has many groups, Slack Channels, IRC channels, and forum's, including one I created: http://discuss.thevalueoflearning.org/

You will be readily welcomed anywhere you happen to plug into the community online or at an in-person event, such a [user group meeting](http://discuss.thevalueoflearning.org/).

## Why learn Clojure?

I can't answer this question for you. That would be too presumptive of me. But I can tell you why I chose Clojure.

In a nutshell, Clojure ticks two major boxes for me.

First and foremost, Clojure is highly practical. Rick Hickey has focused the language strongly around creating business value. There's a recent [success story](https://youtu.be/3y7xzH8jB8A) about an Indonesian company that has experienced a 500% increase in feature release productivity after switching from Go to Clojure. I intend to use Clojure pervasively in my businesses. Clojure is general enough that I could pivot my business in practically any direction and still use Clojure to build on. 

Secondly, Clojure opens up a world of learning and exploration above and beyond what I experienced in other languages. Perhaps this has a lot to do with where I was in my learning journey at the time, but I'm convinced that there really is something uniquely special about the ideas I'm being exposed to in this community. 

As a life-long learner my insatiable curiosity will be occupied for years to come. Paradoxically, [Clojure is boring](https://8thlight.com/blog/colin-jones/2016/10/06/clojure-is-boring.html), and that's a good thing!

There are other lesser reasons, which I will add below as they come to me.

Clojure is web scale out of the box. Clojure has powerful concurrency primitives built-in to the heart of the language. It is unconstrained by a Global Interpreter Lock (GIL), like Ruby and Python are. This isn't a big deal for most new companies, but if you are lucky enough to experience overnight success, perhaps you get selected to go the Oprah show, then you'll be glad you picked Clojure. Most of these web scale issues have to do with architectural issues in addition to language features. A web search for `ruby on rails twitter scaling issues` will list articles which collectively should tell both sides of the story pretty well. Oh, the problems we should have, right!?!

(To be continued soon...)
