package overlapping.containers.block

import org.apache.spark.Partitioner

import scala.math._

/**
 * This computes partition hash value based on complete locations simply
 * by retrieving the first element of the complete location.
 */
class BlockIndexPartitioner(override val numPartitions: Int)
  extends Partitioner{

  def getPartition(key: Any): Int = key match {
    case key: (Int, _, _) => key._1
  }

}
