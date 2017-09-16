---
layout: post
category: howto
date-published: 2017-09-16
title: Running Clojure Code
---

# Running Clojure Code

There are several ways to run or execute Clojure code because Clojure runs in various contexts, e.g. the JVM, the CLR, the Browser, and Node.js.

This guide seeks to explore and discover these various methods of code execution and ultimately help determine which method is best suited for which objectives. However, let's keep things simple at first and build up from there.

Tutorial pre-requisite: Below we run shell commands. If you're not familiar with the running commands from your system's shell or terminal (or is you're a Windows user), please first read our guide [Command Line Quick Start](command-line-quick-start.md)


## Clojure on the JVM

### Fundamentals

The fact that Clojure runs on the JVM is the biggest reason why enterprises such as Walmart and Staples adopted this relatively young language. Clojure doesn't concern itself with Garbage Collection (cleaning up stale memory resources) or other low-level concerns, leaving these to the JVM, which you can think of as like a computer inside your computer. This additional level of abstraction allows your programs to be *portable*, i.e. to run on completely different operating systems such as MacOS, Windows, and Linux to name a few.

Clojure is a program which runs on the JVM. The Clojure program is used to evaluate Clojure code. That evaluation process can be short lived or ongoing.

First let's examine a short-lived example of Clojure code execution. Open






Further Resources:

https://clojure.org/about/dynamic

https://clojure.org/about/jvm_hosted

[A Brief Beginner's Guide To Clojure, General Overview](http://www.unexpected-vortices.com/clojure/brief-beginners-guide/general-overview.html#some-info-about-java)

Quote from Clojurians Slack user noisesmith: another fun trick is that you can run your uberjar to get a repl that can use all of your deps and namespaces
`java -cp my.uber.jar clojure.main` - optionally `rlwrap java -cp my.uber.jar clojure.main` on a *nix to get command line editing and history too
in a pinch I've used this to speed up debugging issues on remote servers

