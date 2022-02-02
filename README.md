# Maven Build Scan™ quickstart

<img src="http://bit.ly/2JSSCT0" align="right" width="280" />

This is an example project that you can use to experience [Build Scans][gradle.com].

It is a small Java project that has the [Gradle Enterprise Maven Extension][manual] already applied.

## Create a Build Scan™

Follow these simple steps to create a Build Scan™:

1. Clone this project
1. Run `./mvnw clean test`

The build should end with something similar to:

    Publishing build scan...
    https://gradle.com/s/ria2s2x5oaazq

Follow the link shown at the end of the build to view your Build Scan™.

## Experiment with Build Scans

Create different kinds of Build Scans by locally modifying this quickstart project. Here are some ideas:

- Edit `src/main/java/example/Example.java` to introduce compile errors
- Add more plugins and more projects

Alternatively, enable one of your own Maven builds to produce Build Scans by following the [step-by-step instructions][instructions].

## Learn more

Read the [Gradle Enterprise Maven Extension User Manual][manual] to learn more about Build Scans and build caching.

## Need help?

Talk to us on the [Gradle forum][gradle-forum].

[gradle.com]: https://www.gradle.com
[terms-of-service]: https://gradle.com/terms-of-service
[instructions]: https://scans.gradle.com
[gradle-forum]: https://discuss.gradle.org/c/help-discuss/scans
[manual]: https://docs.gradle.com/enterprise/maven-extension
