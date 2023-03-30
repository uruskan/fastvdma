/*
Copyright (C) 2019-2023 Antmicro

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

SPDX-License-Identifier: Apache-2.0
*/

package DMAController.Bus

import chisel3._

class AXIStream(val dataWidth : Int) extends Bundle{
  val tdata = Output(UInt(dataWidth.W))
  val tvalid = Output(Bool())
  val tready = Input(Bool())
  val tuser = Output(Bool())
  val tlast = Output(Bool())
}
