# Maven build scan quickstart

<img src="http://bit.ly/2JSSCT0" align="right" width="280" />

This is an example project that you can use to experience [build scans][gradle.com].

It is a small Java project that has the [Gradle Enterprise Maven Extension][manual] already applied.

## Create a build scan

Follow these simple steps to create a build scan:

1. Clone this project
1. Run `./mvnw clean test`

The build should end with something similar to:

    Publishing build scan...
    https://gradle.com/s/ria2s2x5oaazq

Follow the link shown at the end of the build to view your build scan.

## Experiment with build scans

Create different kinds of build scans by locally modifying this quickstart project. Here are some ideas:

- Edit `src/main/java/example/Example.java` to introduce compile errors
- Add more plugins and more projects

Alternatively, enable one of your own Maven builds to produce build scans by following the [step-by-step instructions][instructions].

## Learn more

Read the [Gradle Enterprise Maven Extension User Manual][manual] to learn more about build scans and build caching.

## Need help?

Talk to us on the [Gradle forum][gradle-forum].

[gradle.com]: https://www.gradle.com
[terms-of-service]: https://gradle.com/terms-of-service
[instructions]: https://scans.gradle.com
[gradle-forum]: https://discuss.gradle.org/c/help-discuss/scans
[manual]: https://docs.gradle.com/enterprise/maven-extension
