package main.scala.overlapping.timeSeriesOld

import breeze.linalg.DenseVector

/**
 * Created by Francois Belletti on 7/10/15.
 */

case class SecondOrderSignature(covariation: DenseVector[Double], variation: Double)
